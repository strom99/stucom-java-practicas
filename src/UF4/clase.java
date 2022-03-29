package UF4;

public class clase {
    /*public boolean existeHabitante(Class especiaClass) {
        boolean existeEspecie = false;
        if (habitantes.isEmpty()) {
            return existeEspecie;
        }
        for (int i = 0; i < habitantes.size(); i++) {
            if (habitantes.get(i).getClass().equals(especiaClass)) {
                existeEspecie = true;
                break;
            }
        }
        return existeEspecie;
    }

    public boolean puedeVivir (Especie especie) {
        if (especie instanceof Humano) {
            if (existeHabitante(Ferengiano.class)) {
                return false;
            }
            return true;
        }
        if (especie instanceof Ferengiano) {
            if (existeHabitante(Humano.class)) {
                return false;
            } else {
                return true;
            }
            // return this.clima != "calid";
        }
        return false;
    }

    public void agregarHabitante(Especie especie) {
        this.habitantes.add(especie);


        // app

        if (tierra.puedeVivir(pepe)) {
            tierra.agregarHabitante(pepe);
        } else {
            System.out.println(pepe.getNombre() + " No puede vivir en el planeta "+tierra.getNombre());
        }

        if (tierra.puedeVivir(test)) {
            tierra.agregarHabitante(test);
        } else {
            System.out.println(test.getNombre() + " No puede vivir en el planeta "+tierra.getNombre());
        }
    }*/
    /* -------------- planetas equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Planeta other = (Planeta) obj;

        return this.getNombre().equalsIgnoreCase(other.getNombre());
    }
    ------------------------------------------
    public static void main(String[] args) {
        // Crear una nueva instancia de la clase Planeta

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombre del planeta");
        String nombre = scanner.nextLine();

        Planeta tierra2 = new Planeta(nombre);
        planetas.add(new Planeta("tierra"));

        if (existePlaneta(tierra2)) {
            System.out.println("El planeta " + nombre + " existe");
        } else {
            System.out.println("El planeta " + nombre + " no existe");
            planetas.add(tierra2);
        }

        System.out.println(planetas.toString());

    }
     */
}
