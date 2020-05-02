import com.puligt.interfaz1.MensajeAleatorio;
import com.puligt.interfaz1.VentanaRectanngular;



public class Main {

    public static void main(String[] args) {

        VentanaRectanngular ventana1 = new VentanaRectanngular();
//       ventana1.setExtendedState(Frame.MAXIMIZED_BOTH);
       ventana1.setTitle("La galleta de la fortuna");

        MensajeAleatorio mensaje = new MensajeAleatorio();
        ventana1.add(mensaje);

    }
}
