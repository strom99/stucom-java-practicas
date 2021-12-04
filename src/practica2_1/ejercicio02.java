
package practica2_1;

public class ejercicio02 {

    /**
      Genera dos números aleatorios entre 1 y 3, Muéstralos por pantalla, Los números tendrán la
      siguiente correspondencia
     1 - Piedra
     2 - Papel
     3 - Tijera
     Muestra el equivalente para cada número ,Indica quién gana, En caso de empate deberá indicarse
     y se deberá a volver a ejecutar el código del ejercicio para volver a generar una tirada de piedrapapel - tijera, hasta que alguno gane.
     */
    public static void main(String[] args) {
        
        
        boolean salida = true;
        
        // creo un bucle while para que no me salga si sale empate
            do{
                
                int jugador01 = (int) (Math.random()* 3 ) + 1;
                int jugador02 = (int) (Math.random()* 3 ) + 1;
                String valorJugador01= "";
                String valorJugador02 = "";
        
                // Asignamos el valor de cada numero deljugador1
                switch(jugador01){
                case 1 : 
                    valorJugador01 = "Piedra";
                    break;
                case 2 : 
                    valorJugador01 = "Papel";
                    break;
                case 3 : 
                    valorJugador01 = "Tijera";
                    break;
            }
                // Asignamos el valor de cada numero al jugador2     
            switch(jugador02){
                case 1 : 
                    valorJugador02 = "Piedra";
                    break;
                case 2 : 
                    valorJugador02 = "Papel";
                    break;
                case 3 : 
                    valorJugador02 = "Tijera";
                    break;
            }

            if(valorJugador01 == valorJugador02){
                //Primero comprobaremos si los datos obtenidos son iguales o diferentes entre si
                System.out.println(valorJugador01+" es igual a "+ valorJugador02 );
                System.out.println(" es empate ");

            }else{
                // si mis valores son distinos me hara el calculo
                System.out.println("Partida nueva : ");
                System.out.println("valor jugador 1 : "+jugador01+" "+ valorJugador01);//NEW
                System.out.println("valor jugador 2 : "+jugador02+" "+ valorJugador02);//NEW
                System.out.println("---");
                
                //Hacemos la primera comparacion entre piedra y papel para ambos jugadores
                // si se cumple gana papel, el jugador 2

                if(jugador01 == 1 && jugador02 == 2  ){
                    System.out.println(valorJugador02+" gana "+valorJugador01);
                    System.out.println(" el jugador 2 gana");
                // Hacemos la comparacion entre piedra y tijerap pero cambiamos el valor del jugador 2
                }else if(jugador01 == 1 && jugador02 == 3){
                    System.out.println(valorJugador01+" gana "+valorJugador02);
                    System.out.println(" el jugador 1 gana");
                } 

                //Hacemos la segunda comparacion entre papel y piedra para ambos jugadores
                // si se cumple gana el jugador 1
                if(jugador01 == 2 && jugador02 == 1  ){
                    System.out.println(valorJugador01+" gana "+valorJugador02);
                    System.out.println(" el jugador 1 gana");
                //Hacemos la primer comparacion entre papel y tijera para ambos jugadores pero cambiamos el valor del jugador 2
                }else if(jugador01 == 2 && jugador02 == 3){
                    System.out.println(valorJugador02+" gana "+valorJugador01);
                    System.out.println(" el jugador 2 gana");
                }

                //Hacemos la tercera comparacion entre tijera y piedra para ambos jugadores
                if(jugador01 == 3 && jugador02 == 1  ){
                    System.out.println(valorJugador02+" gana "+valorJugador01);
                    System.out.println(" el jugador 2 gana");
                //Hacemos la tercera comparacion entre tijera y papel para ambos jugadores pero cambiamos el valor del jugador 2
                }else if(jugador01 == 3 && jugador02 == 2){
                    System.out.println(valorJugador01+" gana "+valorJugador02);
                    System.out.println(" el jugador 1 gana");
                }
                // con esto me saldra del bucle , cuando tenga un ganador
                salida = false;
            }
        }while(salida);
            
        
        
    }
    
}
