package Modulo2.Model;

import java.util.ArrayList;

public class Athlete {
    private String name;
    private String nif;
    private  int bib;
    public static int totalBib = 1;
    private int age;
    private String gender;
    //atletas que participan en una carrera
    private ArrayList<Race> athletesRace;

    public Athlete( String nif, String name, int age) {
        this.nif = nif;
        this.bib = totalBib++;
        this.name = name;
        this.age = age;
        athletesRace = new ArrayList<>();
        showMessage();
    }

    public Athlete(String nif, String name, int age, String gender) {
        //this.name = name;
        //this.nif = nif;
        //this.age = age;
        this(nif,name,age);
        this.gender = gender;
    }

    public void showMessage(){
        System.out.println("Memory address : " + this + ", Name : " + getName() + ", Id : "+ getNif()+ ", Bib : "+ getBib());
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

    public int getBib(){ return bib;}

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

    public ArrayList<Race> getAthletesRace(){
        return athletesRace;
    }

    public void setAthletesRace(ArrayList<Race> athletesRace){

    }
}