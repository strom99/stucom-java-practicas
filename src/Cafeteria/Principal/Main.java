package Cafeteria.Principal;

import Cafeteria.Maquinaria.Cafetera;

public class Main {

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(5000, 0);
        cafetera.llenarCafetera();


        // cliente viene y pide una taza de cantidad 8
        cafetera.servirTaza(8);
        // Después de servir la tacita, nuestra cantidad actual será de - cantidad
        System.out.println(cafetera.getCantidadActual());

        cafetera.agregarCafe(3);

        System.out.println(cafetera.getCantidadActual());
    }

}
