package org.example.Components;
import javax.swing.*;
import java.awt.*;
// Ogniwo
public class Ogniwo extends CircuitElement {
    public Ogniwo() {
        super("Ogniwo");
        setPreferredSize(new Dimension(100, 30));
        setOpaque(true);
        setBackground(Color.GREEN);  // Kolor ogniwa
    }
}
