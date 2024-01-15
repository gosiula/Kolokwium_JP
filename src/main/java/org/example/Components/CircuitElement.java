package org.example.Components;

import javax.swing.*;
import java.awt.*;

public class CircuitElement extends JButton {
    private String elementType;

    public CircuitElement(String elementType) {
        this.elementType = elementType;
        setText(elementType);
        setFocusPainted(false);
    }

    public String getElementType() {
        return elementType;
    }

    public void draw(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        g.setColor(getForeground());
        g.drawRect(getX(), getY(), getWidth(), getHeight());
        g.drawString(getText(), getX() + 10, getY() + 20);
    }
}
