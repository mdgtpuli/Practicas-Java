package com.puligt.interfaz1;

import javax.swing.*;
import java.awt.*;

public class MensajeAleatorio extends JPanel{

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString(getRadomMessage(), 20, 30);
        }

        private String getRadomMessage() {
            String mensaje1 = "Hoy va a ser un gran día. ";
            String mensaje2 = "Hoy va a ser un buen día. ";
            String mensaje3 = "Sobrevirás a este día. ";
            String mensaje4 = "Nuevos retos amenazan con acabar con tu paciencia. ";
            String mensaje5 = "Es posible que no aprendas nada hoy. ";
            String mensaje6 = "Alguien que tocará hoy las narices. Es posibles que seas tú. ";
            String mensaje7 = "Date un respiro. ";
            String mensaje8 = "La vida es dura. Y tú eres pobre. ";
            String mensaje9 = "Hoy no perderás la paciencia. ";
            String mensaje10 = "¡Meh!";

           String arrayMensajes[] = {mensaje1, mensaje2, mensaje3, mensaje4, mensaje5, mensaje5, mensaje6,
                   mensaje7, mensaje8, mensaje9, mensaje10};
            double randomDouble = Math.random();
            randomDouble = randomDouble * 10 + 1;
            int randomInt = (int) randomDouble;
            return arrayMensajes[randomInt];

        }


}
