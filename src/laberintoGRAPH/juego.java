package laberintoGRAPH;


import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class juego extends JPanel{

    @Override // por ser un metodo heredado de JPanel
    public void paint(Graphics grafico){

    }
    public static void main(String[] args) {
        JFrame miventana = new JFrame ("mi primer JUEGO");
        juego game = new juego();//objeto de juego class
        miventana.add(game);

        miventana.setSize(920, 540);//tamaño ventana
        miventana.setLocation(300, 200);//posicion ventana en la pantalla
        miventana.setVisible(true);//para que se muestre

        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
