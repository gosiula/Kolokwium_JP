package org.example.Components;

import javax.swing.*;

// RECTANGLE THREAD - MANAGING THE MOVEMENT OF THE RECTANGLES
public class RectangleThread extends Thread {
    private final Rectangle rectangle;
    private final DrawingPanel drawingPanel;

    // RectangleThread constructor
    public RectangleThread(Rectangle rectangle, DrawingPanel drawingPanel) {
        this.rectangle = rectangle;
        this.drawingPanel = drawingPanel;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }


    // run method to move the rectangles
    @Override
    public void run() {
        while (true) {
            SwingUtilities.invokeLater(drawingPanel::repaint);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
