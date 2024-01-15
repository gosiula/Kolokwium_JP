package org.example.Components;

import javax.swing.*;
import java.awt.*;

// Przewodnik
public class Przewodnik extends CircuitElement {
    public Przewodnik() {
        super("Przewodnik");
        setPreferredSize(new Dimension(150, 10));
        setOpaque(true);
        setBackground(Color.BLUE);
    }
}
