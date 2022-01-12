package laberintoGRAPH;


import java.awt.Color;
import java.awt.Graphics;

public class personaje {

    private int x = 40 ;
    private int y = 40;
    private final int ancho = 40 ;
    private final int alto = 40 ;
    private final int movimiento = 40;

    public void paint(Graphics grafico){
        grafico.setColor(Color.red);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.BLACK);
        grafico.drawOval(x, y, ancho, alto);
    }

}
