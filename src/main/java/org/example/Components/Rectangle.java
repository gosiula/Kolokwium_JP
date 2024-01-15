package org.example.Components;

import java.awt.*;

// RECTANGLE PARAMETERS AND MOVEMENT
public class Rectangle {
    private int x;
    private int y;
    private final Color fillColor;
    private final Color borderColor;

    // Rectangle Constructor
    public Rectangle(int x, int y, Color fillColor, Color borderColor) {
        this.x = x;
        this.y = y;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }



    public Color getFillColor() {
        return fillColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }




    // Add methods to get width and height
    public int getWidth() {
        return x;
    }

    public int getHeight() {
        return y;
    }
}
