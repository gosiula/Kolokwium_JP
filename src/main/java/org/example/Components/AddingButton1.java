package org.example.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddingButton1 extends JButton {
    private DrawingPanel drawingPanel;

    public AddingButton1(String text, DrawingPanel drawingPanel) {
        super(text);
        this.drawingPanel = drawingPanel;

        Color colorPink2 = Color.decode("#D84F74");
        setForeground(colorPink2);
        Font font2 = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25);
        setFont(font2);

        class ButtonMouseListener extends MouseAdapter {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawingPanel.addRectangle();
            }
        }
    }
}
