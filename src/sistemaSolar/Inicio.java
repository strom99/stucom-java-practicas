package sistemaSolar;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Planeta planetas [] = new Planeta[5];
        boolean salida = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu ");
            System.out.println("Crear planeta [1]");
            System.out.println("Ver planetas  [2]");
            System.out.println("salir [0]");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    int numIdentificador;
                    String nombre ;
                    int masa;
                    int densidad;
                    int diametro;
                    int distanciaSol;
                    boolean espacioPlanetas = false;

                    do {
                        System.out.println("Introduce el numero identificador : (no puede ser negativo)");
                        numIdentificador = sc.nextInt();
                    }while (numIdentificador < 0);

                    sc.nextLine();
                    System.out.println("Introduce el nombre del planeta :");
                    nombre = sc.nextLine();

                    do {
                        System.out.println("Introduce la masa del planeta :");
                        masa = sc.nextInt();
                    }while (masa < 0);

                    do {
                        System.out.println("Introduce la densidad del planeta :");
                        densidad = sc.nextInt();
                    }while (densidad < 0);

                    do {
                        System.out.println("Introduce el diametro del planeta :");
                        diametro = sc.nextInt();
                    }while (diametro < 0);

                    do {
                        System.out.println("Introduce la distancia al sol del planeta :");
                        distanciaSol = sc.nextInt();
                    }while (distanciaSol < 0);

                    for (int i = 0; i < planetas.length && !espacioPlanetas ; i++){
                        if(planetas[i] == null){
                            planetas[i] = new Planeta(numIdentificador , nombre , masa ,densidad,diametro,distanciaSol);
                            espacioPlanetas =true;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Lista de planetas : ");

                    for (Planeta itemPlaneta : planetas) {
                        if (itemPlaneta != null){
                            System.out.println("numero identificador : "+ itemPlaneta.numIdentificador);
                            System.out.println("nombre planeta : " + itemPlaneta.nombre);
                            System.out.println("masa :"+ itemPlaneta.masa);
                            System.out.println("densidad :" + itemPlaneta.densidad);
                            System.out.println("diametro : "+ itemPlaneta.diametro);
                            System.out.println("distancia sol :" + itemPlaneta.distanciaSol);
                            System.out.println(" ------------------------------- ");
                        }else {
                            System.out.println("vacio");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    salida = true;
                    break;
            }
        }while (!salida);
    }
}
