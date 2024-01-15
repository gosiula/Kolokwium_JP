package org.example.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// DRAWING PANEL - SIZE, LOCATION, COLOR, THREADS MANAGING CREATED RECTANGLES
public class DrawingPanel extends JPanel {
    private final List<RectangleThread> rectangleThreads = new ArrayList<>();
    private Rectangle currentRectangle = null;
    private int startX, startY;
    private final Random random = new Random();
    Color randomColorFill;

    // available colors for the rectangles
    private final Color[] availableColors = {
            Color.decode("#318237"), Color.decode("#90D896"), Color.decode("#BAEBBE"),
            Color.decode("#8C3ABC"), Color.decode("#C397DC"), Color.decode("#DCBDEE"),
            Color.decode("#5394B3"), Color.decode("#93BAD7"), Color.decode("#C0D9EC")
    };

    // DrawingPanel constructor
    public DrawingPanel() {
        setFocusable(true);
        requestFocusInWindow();
        setBorder(BorderFactory.createLineBorder(Color.WHITE, 10)); // border of the drawing panel
        setLayout(null);  // Adjusted to null layout
        setSize(800, 400); // size
        setLocation(100, 100); // location
        setOpaque(true);
        Color colorPink3 = Color.decode("#F7BAD3"); // color
        setBackground(colorPink3);
    }

    private Color getRandomColor() {
        return availableColors[random.nextInt(availableColors.length)];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (RectangleThread rectangleThread : rectangleThreads) {
            Rectangle rectangle = rectangleThread.getRectangle();
            g.setColor(rectangle.getFillColor());
            //g.fillRect(rectangle.getRandomLocation(), rectanglegetRandomLocation(),rectangle.getWidth(), rectangle.getHeight());
        }
    }

    public void addRectangle() {
        randomColorFill = getRandomColor();

        int randomX = getRandomLocation(getWidth() - 100);

        // random location y
        int randomY = getRandomLocation(getHeight() - 100);

        // random color
        Color randomColor = Color.BLACK;

        // creating a new circle
        Rectangle currentRectangle = new Rectangle(randomX, randomY, randomColor, randomColor);

        // starting a new thread when the mouse is pressed
        RectangleThread rectangleThread = new RectangleThread(currentRectangle, this);
        rectangleThreads.add(rectangleThread);
        rectangleThread.start();
    }

    // creating a random location of the circle
    private int getRandomLocation(int max) {
        Random random = new Random();
        int margin = 20;
        return margin + random.nextInt(max - 2 * margin);
    }


}
