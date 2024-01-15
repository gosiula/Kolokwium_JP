package org.example.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddingButton extends JButton {
    private DrawingPanel drawingPanel;
    private String elementType;

    public AddingButton(String text, DrawingPanel drawingPanel, String elementType) {
        super();
        setText(text); // text
        Color colorPink2 = Color.decode("#D84F74");
        setForeground(colorPink2); // color
        Font font2 = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25);
        setFont(font2); // font

        this.drawingPanel = drawingPanel;
        this.elementType = elementType;

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addElementToDrawingPanel();
            }
        });
    }

    private void addElementToDrawingPanel() {
        int x = (int) (Math.random() * (drawingPanel.getWidth() - 100));
        int y = (int) (Math.random() * (drawingPanel.getHeight() - 30));

        switch (elementType) {
            case "Przewodnik" -> drawingPanel.addCircuitElement(new Przewodnik(), x, y);
            case "Opornik" -> drawingPanel.addCircuitElement(new Opornik(), x, y);
            case "Ogniwo" -> drawingPanel.addCircuitElement(new Ogniwo(), x, y);
            default -> {
            }
        }
    }
}
