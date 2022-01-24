package POO;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Atleta atletas[] = new Atleta[5];
        boolean exist = false;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("bienvenido atleta");
            System.out.println("[1] ingresa atleta");
            System.out.println("[2] Mostrar todos los atletas");
            System.out.println("[3] Borrar atleta");
            System.out.println("[4] Modificar atleta");
            System.out.println("[0] salir");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 :
                    // iniciamos pidiendo datos del atleta
                    int edad , dorsal;
                    String nombre;
                    char genero;

                    do{
                        System.out.println("introduce la edad del atleta : ");
                        edad = sc.nextInt();
                    }while (edad < 0);

                    do{
                        System.out.println("introduce el dorsal : ");
                        dorsal = sc.nextInt();
                    }while (dorsal < 0);

                    //para vaciar el baser de string y no de fallos al pedir string luego de un numero
                    sc.nextLine();
                    System.out.println("Introduce el nombre del atleta : ");
                    nombre = sc.nextLine();

                    do{
                        System.out.println("introduce el genero : [M] o [F]");
                        genero = sc.next().charAt(0);
                    }while (genero != 'M' && genero != 'F');

                    // esto llama al constructor de atleta
                    //Atleta atleta = new Atleta(edad , dorsal , nombre , genero);

                    // almacenamos el array
                    boolean espacio = false;
                    for(int i = 0; i < atletas.length && !espacio; i++){
                        if (atletas[i] == null){
                            atletas[i] = new Atleta(edad , dorsal , nombre , genero);
                            espacio = true;
                        }
                    }

                    if (!espacio){
                        System.out.println("no hay espacio , borra algun atleta");
                    }else{
                        System.out.println("atleta creado");
                    }


                    break;
                case 2:

                    System.out.println("lista atletas");
                    for (Atleta atleta : atletas) {
                        if (atleta != null) {
                            System.out.println("edad " + atleta.edad);
                            System.out.println("edad " + atleta.dorsal);
                            System.out.println("edad " + atleta.nombre);
                            System.out.println("edad " + atleta.genero);
                        }
                    }


                    break;
                case 3:
                    String nombreDelete;
                    System.out.println("Introduce el nombre a eliminar");
                    sc.nextLine();
                    nombreDelete = sc.nextLine();

                    for (int i = 0; i < atletas.length ; i++){
                        if(atletas[i].nombre.equals(nombreDelete)){
                            System.out.println("encontrado, atleta borrado correctamente");
                            atletas[i] = null;
                            break;
                        }
                    }
                    break;
                case 0:
                    exist = true;
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }

        }while (!exist);
    }
}
