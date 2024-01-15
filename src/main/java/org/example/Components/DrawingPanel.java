package org.example.Components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseEvent;
//
public class DrawingPanel extends JPanel {
    private List<CircuitElement> elements = new ArrayList<>();
    private boolean dragging = false;
    private int offsetX, offsetY;

    // DrawingPanel constructor
    public DrawingPanel() {
        setFocusable(true);
        requestFocusInWindow();
        setBorder(BorderFactory.createLineBorder(Color.WHITE, 10)); // border of the drawing panel
        setLayout(new GridLayout(0, 1, 20, 20));
        setSize(800, 400); // size
        setLocation(100, 100); // location
        setOpaque(true);
        Color colorPink3 = Color.decode("#F7BAD3"); // color
        setBackground(colorPink3);
    }

    public void addCircuitElement(CircuitElement element, int x, int y) {
        element.setBounds(x, y, 100, 30);
        elements.add(element);
        add(element);
        revalidate();
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (CircuitElement element : elements) {
            element.draw(g);
        }
    }


    @Override
    protected void processMouseMotionEvent(MouseEvent e) {
        super.processMouseMotionEvent(e);
        if (dragging) {
            Component component = getComponentAt(e.getPoint());
            if (component instanceof CircuitElement) {
                component.setLocation(e.getX() - offsetX, e.getY() - offsetY);
                repaint();
            }
        }
    }

    @Override
    protected void processMouseEvent(MouseEvent e) {
        super.processMouseEvent(e);
        if (e.getID() == MouseEvent.MOUSE_PRESSED) {
            Component component = getComponentAt(e.getPoint());
            if (component instanceof CircuitElement) {
                dragging = true;
                offsetX = e.getX() - component.getX();
                offsetY = e.getY() - component.getY();
            }
        } else if (e.getID() == MouseEvent.MOUSE_RELEASED) {
            dragging = false;
        }
    }

    public void drawElements() {
        repaint();
    }
}
