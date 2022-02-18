package Modulo2.Model;

public class Athlete {
    private String name;
    private String nif;
    private int age;
    private String gender;

    public Athlete( String nif, String name, int age) {
        this.nif = nif;
        this.name = name;
        this.age = age;
    }

    public Athlete(String nif, String name, int age, String gender) {
        //this.name = name;
        //this.nif = nif;
        //this.age = age;
        this(nif,name,age);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isSenior() {
        return getAge() > 50;
    }
}