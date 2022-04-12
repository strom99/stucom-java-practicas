package CensoOrganizado.Model;

public class Human extends Race {
    /* Humans regulate many factors of their life in the turns that their
     planet around its main star (the Sun)*/
    private int age;
    private char gender;

    public Human(String name){
        super(name);
    }
    public Human(String name , int age , char gender){
        super(name, 1);
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static int correctAge(int age){
        if(age < 0 || age > 130){
            System.out.println("the age is wrong");
        }
        return age;
    }
    @Override
    public String toString() {
        return "Humano: "+ getName()+
                " - nivelCivilizacion:" + civilizationLevel +
                " - edad: " + age +
                " - genero: '" + gender;
    }
}
