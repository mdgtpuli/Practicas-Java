package com.puligt.interfaz1;

import javax.swing.*;
import java.awt.*;

public class VentanaRectanngular extends JFrame{

    public VentanaRectanngular(){
        setSize(500, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image icono = toolkit.getImage("src/Images/sol.jpg");
        setIconImage(icono);
        setVisible(true);
    }
}
