package org.example.Components;
import javax.swing.*;
import java.awt.*;

// Opornik
public class Opornik extends CircuitElement {
    public Opornik() {
        super("Opornik");
        setPreferredSize(new Dimension(100, 30));
        setOpaque(true);
        setBackground(Color.RED);  // Kolor opornika
    }
}
