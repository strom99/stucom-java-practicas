package ArrayList;

import java.util.ArrayList;
import java.util.Locale;

public class inicio {

    // final , que no va a cambiar de valor nunca EJ  : final double NUMERO = 8;
    final double PI = 3.333;
    public static void main(String[] args) {


        // ARRAY LIST --->> es mutable( crece) , solo se almacenan objetos , no de primitivos
        ArrayList<Superheroe> superheroes = new ArrayList<>();
        System.out.println("tamaño"+ superheroes);
        System.out.println("tamaño"+ superheroes.size());

        for (int i = 0; i < 5 ; i++){
            //.add() añade los valores siempre al final de la fila
            superheroes.add(new Superheroe("mercedes"));
        }

        System.out.println("tamaño"+ superheroes.size());
        // static para elementos globales , para metodos

        Superheroe a = new Superheroe("renault");
        superheroes.add(a);

        // da un booleano , verifica si existe dentro del arraylist
        System.out.println(superheroes.contains(a));
        System.out.println("tamaño"+ superheroes.size());
        System.out.println("-------------------------------------");
        // devuelve la direccion de los objetos dentro del arrayList
        for (int i = 0; i < superheroes.size() ; i++){
            System.out.println(superheroes.get(i).getName());
        }

        // como borrar
        // remove(objet)
        System.out.println("-------------------------------------");
        superheroes.remove(a);
        for (int i = 0; i < superheroes.size() ; i++){
            System.out.println(superheroes.get(i).getName());
        }

        // borrar por posciones
        System.out.println("-------------------------------------");
        superheroes.remove(0);
        superheroes.remove(1);
        superheroes.remove(2);

        // y para eliminar en un bucle , removeAll(superheroes) -- borra el contenido del array , pero sigue existiendo ese array , pero vacio
        for (int i = 0; i < superheroes.size() ; i++){
            System.out.println(superheroes.get(i).getName());
        }

       // a = b ; b apuntaria 'a'
        // .equals es igual a '==' con los objetos , apunta a la direccion, excepto con los strings

        // ----- pasar de un arrayList a Arary normal y viceversa- -----
         //remove(int position)
        //contexto general
        // ARRAY ----->>  no es mutable
        // ARRAY LIST --->> es mutable( crece) , solo se almacenan objetos , no de primitivos

        // String
        System.out.println("-------------------------------------");
        String x = new String("pepe");
        String y = new String("pepe");

        // compara las direcciones
        if(x == y){
            System.out.println("son el mismo objeto");
        }else{
            System.out.println("no lo son");
        }

        // aqui compara contenido del string
        if(x.equals(y)){
            System.out.println("son iguales");
        }else{
            System.out.println("no");
        }
        // String normal
        // las varibales que se llamen e manera diferente pero tengan el mismo valor  , apuntan al mismo objeto apra ahorrar espacio
        // y tienen la misma direccion de objeto

        String r = x.toUpperCase(); // esto crea un nuevo pepe en mayuscula , no es mutable
        //StringBuilder ---- son mutables
        StringBuilder t = new StringBuilder();
        t.append("peres"); // concatena perez , poniendolo en la misma posicion , stringbuilder es mutable , es diferente al string , si usas el equals , no seran iguales
    }
}
