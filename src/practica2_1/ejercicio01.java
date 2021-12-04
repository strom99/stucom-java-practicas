
package practica2_1;

public class ejercicio01 {

    /**
     * Genera un número aleatorio entre 1 y 31, Simulará el día de nacimiento de una persona ,Genera
    otro número aleatorio entre 1 y 12, Simulará el mes de nacimiento, Muéstralos por pantalla - A
    continuación, debes indicar si la fecha es correcta (por ejemplo, el día 30 y mes 2 debería indicar
    fecha incorrecta) o no, Si es correcta, deberá mostrar además a qué signo del zodíaco pertenece.
     */
    public static void main(String[] args) {
        
        // pido dos numeros aleatorios , el primero entre 31 - 1 que luego el +1, haga una suma de 1 - 31, el segundo entre 12 -1 que luego el +1, haga una suma de 1-12
        int diaNacimiento = (int) (Math.random() * 31) +1;
        int mesNacimiento = (int) (Math.random() * 12) +1;
        // creo un string vacio para almacenar ahi el nombre de los meses
        String nombreMes = " ";
        
        /*7 --31 enero, marzo , mayo ,julio, agosto,octubre,diciembre,
        4 -- 30 abril, junio, septiembre,noviembre
        1 -- 28 febrero */
        // muestro si o si el dia y mes de nacimiento dictados para guiarnos
        System.out.println("dia :"+diaNacimiento);
        System.out.println("mes : "+mesNacimiento);
        
        
        //Creo un switch para calcular desde los meses , asignandolo acada caso
            switch(mesNacimiento){
                // en cada caso se usara una condicional para especificar la cantidad de dias de cada mes que tenga 30 o 30
                case 1 : 
                    nombreMes = "enero";
                    //usamos una condicional para poner un rango de desde que fecha para adelante inicia el signo Acuario
                    if(diaNacimiento >= 20){
                        System.out.println("Signo zodiacal : Acuario");
                    }else{
                        // y un else para la fecha menor especificada, tomando el signo de capricornio 
                        System.out.println("Signo zodiacal : Capricornio");
                    }
                    // enero cuenta con 31 dias con lo que no necesitamos condicional, lo usaremos por defecto que 31 dias son correctos
                    System.out.println("Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                    break;
                
                case 2 : 
                        nombreMes = "febrero";
                    // febrero = 28dias -- iniciamos con un bucle , descartando que el dia no sobrepaso de 28 para el mes de febrero
                        if(diaNacimiento > 28){
                             System.out.println("la fecha es incorrecta, no coinciden");
                        }else{
                            // un bucle para especificar desde que fecha para arriba inicia el signo de picis
                                if(diaNacimiento >= 19){
                                    System.out.println("Signo zodiacal : picis");
                                // en caso de ser un numero inferior , continua con el anterior signo
                                }else{
                                    System.out.println("Signo zodiacal : Acuario");
                                }
                            // imprime el valor correcto   
                            System.out.println(" Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                        }
                    break;
                
                case 3 :
                    // marzo = 31 dias
                    nombreMes = "marzo";
                    // una condicional para calcular el inicio en adelante del signo aries
                    if(diaNacimiento >= 21){
                            System.out.println("Signo zodiacal : Aries");
                        }else{
                        // en caso de ser un numero inferior , continua con el anterior signo
                            System.out.println("Signo zodiacal : Picis");
                    }
                    // por defecto cuenta por 31 dias , por lo que solo imprimiria el dato
                    System.out.println(" Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                    break;
                
                case 4 :
                    //abril = 30 dias
                    nombreMes = "abril";
                    // condicional para descartar que mis dias no pasen de 30
                    if(diaNacimiento > 30){
                            System.out.println("la fecha es incorrecta, no coinciden");
                        }else{
                        // luego de descartar que no es incorrecta , hace la operacion 
                        // añadimos otra  condicional para los signos
                                if(diaNacimiento >= 20){
                                    System.out.println("Signo zodiacal : Leo");
                                // en caso de ser un numero inferior , continua con el anterior signo
                                }else{
                                    System.out.println("Signo zodiacal : Aries");
                                }
                            System.out.println(" Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                        }
                    break;
                
                case 5 : 
                    nombreMes = "mayo";
                    // mayo = 31 dias
                    
                    if(diaNacimiento >= 21){
                            System.out.println("Signo zodiacal : Geminis");
                        // en caso de ser un numero inferior , continua con el anterior signo
                        }else{
                            System.out.println("Signo zodiacal : Leo");
                    }
                    // imprimimos 
                    System.out.println("Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                    break;
                
                case 6:
                    nombreMes = "junio";
                    // junio = 30 dias
                    // usamos una condicional para especificar que junio tiene 30 dias
                    if(diaNacimiento > 30){
                            System.out.println("la fecha es incorrecta, no coinciden");
                        }else{
                        // si el resultado es correcto , calculara el signo zodiacal con un nuevo if
                                if(diaNacimiento >= 21){
                                    System.out.println("Signo zodiacal : Cancer");
                                // en caso de ser un numero inferior , continua con el anterior signo
                                }else{
                                    System.out.println("Signo zodiacal : Geminis");
                                }
                                // imprimer que el valor es correcto con los datos
                            System.out.println(" Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                        }
                    break;
                
                case 7:
                    // julio = 31 dias
                    nombreMes = "julio";
                    // calculamos solo el signo zodiacal con un if
                    if(diaNacimiento >= 23){
                            System.out.println("Signo zodiacal : Leo");
                        // en caso de ser un numero inferior , continua con el anterior signo
                        }else{
                        System.out.println("Signo zodiacal : Cancer");
                    }
                    // imprimer que el valor es correcto con los datos
                    System.out.println("Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                    break;
                
                case 8:
                    nombreMes = "agosto";
                    // calculamos solo el signo zodiacal con un if
                    if(diaNacimiento >= 23){
                            System.out.println("Signo zodiacal : Virgo");
                        // en caso de ser un numero inferior , continua con el anterior signo
                        }else{
                            System.out.println("Signo zodiacal : Leo");
                        }
                    // imprimer que el valor es correcto con los datos
                    System.out.println("Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                    break;
                
                case 9:
                    nombreMes = "septiembre";
                    // usamos una condicional para especificar que junio tiene 30 dias
                    if(diaNacimiento > 30){
                            System.out.println("la fecha es incorrecta, no coinciden");
                        }else{
                        // imprimer que el valor es correcto con los datos
                        // y calcula con un if el signo zodiacal
                                if(diaNacimiento >= 23){
                                    System.out.println("Signo zodiacal : Libra");
                                // en caso de ser un numero inferior , continua con el anterior signo
                                }else{
                                    System.out.println("Signo zodiacal : Virgo");
                                }
                            System.out.println("Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                        }
                    break;
                
                case 10:
                    nombreMes = "octubre";
                    // calculamos solo el signo zodiacal con un if
                    if(diaNacimiento >= 23){
                            System.out.println("Signo zodiacal : Escorpio");
                        // en caso de ser un numero inferior , continua con el anterior signo
                        }else{
                            System.out.println("Signo zodiacal : Libra");
                    }
                    // imprime el dato correcto
                    System.out.println("Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                    break;
                
                case 11:
                    nombreMes = "noviembre";
                    // novimebre = 30 dias
                    // usamos una condicional para especificar que junio tiene 30 dias
                    if(diaNacimiento > 30){
                            System.out.println("la fecha es incorrecta, no coinciden");
                        }else{
                                // calculamos solo el signo zodiacal con un if
                                if(diaNacimiento >= 22){
                                    System.out.println("Signo zodiacal : Sagitario");
                                // en caso de ser un numero inferior , continua con el anterior signo
                                }else{
                                    System.out.println("Signo zodiacal : Escorpio");
                                }
                            System.out.println("Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                        }
                    break;
                
                case 12:
                    nombreMes = "diciembre";
                    // diciembre = 31 dias
                    // calculamos solo el signo zodiacal con un if
                    if(diaNacimiento >= 22){
                            System.out.println("Signo zodiacal : Capricornio");
                        // en caso de ser un numero inferior , continua con el anterior signo
                        }else{
                            System.out.println("Signo zodiacal : Sagitario");
                        }
                    System.out.println("Correcto : --> dia : "+ diaNacimiento + " de "+ nombreMes);
                    break;
                    
            }
            
        
    }
    
}
