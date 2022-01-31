package sistemaSolar;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Planeta planetas[] = new Planeta[5];
        boolean salida = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu ");
            System.out.println("Crear planeta [1]");
            System.out.println("Ver planetas  [2]");
            System.out.println("Buscar un planeta [3]");
            System.out.println("Modificar [4]");
            System.out.println("Eliminar un planeta [5]");
            System.out.println("salir [0]");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    int numIdentificador;
                    boolean checkEspa = true;
                    String nombre;
                    int masa;
                    int densidad;
                    int diametro;
                    int distanciaSol;
                    boolean espacioPlanetas = false;
                    boolean espa = false;
                    int cont = 0;


                    for (int i = 0; i < planetas.length && !espa; i++) {
                        if (planetas[i] == null) {
                            cont++;
                        }
                    }

                    if (cont != 0) {
                        do {
                            System.out.println("Introduce el numero identificador : (no puede ser negativo)");
                            numIdentificador = sc.nextInt();
                        } while (numIdentificador < 0);

                        sc.nextLine();
                        System.out.println("Introduce el nombre del planeta :");
                        nombre = sc.nextLine();

                        do {
                            System.out.println("Introduce la masa del planeta :");
                            masa = sc.nextInt();
                        } while (masa < 0);

                        do {
                            System.out.println("Introduce la densidad del planeta :");
                            densidad = sc.nextInt();
                        } while (densidad < 0);

                        do {
                            System.out.println("Introduce el diametro del planeta :");
                            diametro = sc.nextInt();
                        } while (diametro < 0);

                        do {
                            System.out.println("Introduce la distancia al sol del planeta :");
                            distanciaSol = sc.nextInt();
                        } while (distanciaSol < 0);

                        for (int i = 0; i < planetas.length && !espacioPlanetas; i++) {
                            if (planetas[i] == null) {
                                planetas[i] = new Planeta(numIdentificador, nombre, masa, densidad, diametro, distanciaSol);
                                espacioPlanetas = true;
                                checkEspa = false;
                            }
                        }
                    } else {
                        System.out.println("no hay espacio");
                    }
                    break;
                case 2:
                    System.out.println("Lista de planetas : ");

                    for (Planeta itemPlaneta : planetas) {
                        if (itemPlaneta != null) {
                            System.out.println("numero identificador : " + itemPlaneta.numIdentificador);
                            System.out.println("nombre planeta : " + itemPlaneta.nombre);
                            System.out.println("masa :" + itemPlaneta.masa);
                            System.out.println("densidad :" + itemPlaneta.densidad);
                            System.out.println("diametro : " + itemPlaneta.diametro);
                            System.out.println("distancia sol :" + itemPlaneta.distanciaSol);
                            System.out.println(" ------------------------------- ");

                        }
                    }
                    break;
                case 3:
                    boolean encontrado = false;
                    String nombreBusqueda ;
                    System.out.println("Ingresa el nombre del planeta que deseas buscar :");
                    sc.nextLine();
                    nombreBusqueda = sc.nextLine();

                    for (int i = 0 ; i < planetas.length && !encontrado ; i++){
                        if(planetas[i].nombre.equals(nombreBusqueda)){
                            System.out.println("-------------");
                            System.out.println("numero identificador : " + planetas[i].numIdentificador);
                            System.out.println("nombre planeta : " + planetas[i].nombre);
                            System.out.println("masa :" + planetas[i].masa);
                            System.out.println("densidad :" + planetas[i].densidad);
                            System.out.println("diametro : " + planetas[i].diametro);
                            System.out.println("distancia sol :" + planetas[i].distanciaSol);
                            System.out.println(" ------------------------------- ");
                            encontrado = true;
                        }
                    }

                    break;
                case 4 :

                    int opcionModificable ;
                    System.out.println(" ------------------------------- ");
                    System.out.println("Que caracteristica quieres modificar ?");
                    System.out.println("ID planeta [1]");
                    System.out.println("nombre planeta  [2]");
                    System.out.println("masa [3]");
                    System.out.println("densidad [4]");
                    System.out.println("diametro [5]");
                    System.out.println("distancia sol [6]");
                    System.out.println(" ------------------------------- ");
                    opcionModificable = sc.nextInt();

                    switch (opcionModificable){
                        case 1 :
                            boolean idencontrado = false;
                            int idmodificable ;
                            int idnuevo;
                            System.out.println("Introduce el ID que quieres modificar :");
                            idmodificable = sc.nextInt();
                            System.out.println("introduce el nuevo ID");
                            idnuevo = sc.nextInt();

                            for (int i = 0 ; i < planetas.length && !idencontrado ; i++){
                                if(planetas[i].numIdentificador == idmodificable){
                                    planetas[i].numIdentificador = idnuevo;
                                    idencontrado = true;
                                }
                            }
                            break;
                        case 2 :
                            boolean nombreEncontrado = false;
                            String nombreNuevo ;
                            String nombreModificado ;
                            System.out.println("Introduce el nombre del planeta que quieres modificar : ");
                            sc.nextLine();
                            nombreModificado = sc.nextLine();
                            System.out.println("Introduce el nuevo nombre :");
                            nombreNuevo = sc.nextLine();

                            for (int i = 0 ; i < planetas.length && !nombreEncontrado ; i++){
                                if(planetas[i].nombre.equals(nombreModificado)){
                                    planetas[i].nombre = nombreNuevo;
                                    nombreEncontrado = true;
                                }
                            }
                            break;
                        case 3 :
                            boolean masaEncontrada = false;
                            int masaModificable ;
                            int masaNueva;
                            System.out.println("Introduce la masa que quieres modificar :");
                            masaModificable = sc.nextInt();
                            System.out.println("introduce la nueva masa");
                            masaNueva = sc.nextInt();

                            for (int i = 0 ; i < planetas.length && !masaEncontrada ; i++){
                                if(planetas[i].masa == masaModificable){
                                    planetas[i].masa = masaNueva;
                                    masaEncontrada = true;
                                }
                            }
                            break;
                        case 4:
                            boolean densidadEncontrada = false;
                            int densidadModificable ;
                            int densidadNueva;
                            System.out.println("Introduce la densidad que quieres modificar :");
                            densidadModificable = sc.nextInt();
                            System.out.println("introduce la nueva masa");
                            densidadNueva = sc.nextInt();

                            for (int i = 0 ; i < planetas.length && !densidadEncontrada ; i++){
                                if(planetas[i].masa == densidadModificable){
                                    planetas[i].masa = densidadNueva;
                                    densidadEncontrada = true;
                                }
                            }
                            break;
                        case 5:
                            boolean diametroEncontrado = false;
                            int diametroModificable ;
                            int diametroNuevo;
                            System.out.println("Introduce el diametro que quieres modificar :");
                            diametroModificable = sc.nextInt();
                            System.out.println("introduce el nuevo diametro : ");
                            diametroNuevo = sc.nextInt();

                            for (int i = 0 ; i < planetas.length && !diametroEncontrado ; i++){
                                if(planetas[i].masa == diametroModificable){
                                    planetas[i].masa = diametroNuevo;
                                    diametroEncontrado = true;
                                }
                            }
                            break;
                        case 6:
                            boolean distanciaSolEncontrada = false;
                            int distanciaSolModificable ;
                            int distanciaSolNueva;
                            System.out.println("Introduce el diametro que quieres modificar :");
                            distanciaSolModificable = sc.nextInt();
                            System.out.println("introduce el nuevo diametro : ");
                            distanciaSolNueva = sc.nextInt();

                            for (int i = 0 ; i < planetas.length && !distanciaSolEncontrada ; i++){
                                if(planetas[i].masa == distanciaSolModificable){
                                    planetas[i].masa = distanciaSolNueva;
                                    distanciaSolEncontrada = true;
                                }
                            }
                            break;
                    }
                    break;
                case 5 :
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    salida = true;
                    break;
            }

        }while (!salida);
    }
}
