package Modulo2.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Race {
    private String id;
    private String location;
    private int kilometres;
    private LocalDateTime fechaHoraRegistro;
    private ArrayList<Athlete> participants;

    public void show(){
        System.out.println("Race created --> Memory address: "+ this + " code: "+ getId()+ ", datetime: "+ getFechaHoraRegistro() );
    }

    public Race (String id , String localidad , int kilometros){
        this.id = id;
        this.location = localidad;
        this.kilometres = kilometros;
        participants = new ArrayList<>();
        fechaHoraRegistro = LocalDateTime.now();
        show();
    }

    public String getId() {
        return id;
    }

    public String getLocalidad() {
        return location;
    }

    public int getKilometros() {
        return kilometres;
    }

    public LocalDateTime getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public ArrayList<Athlete> getParticipantes() {
        return participants;
    }

    public ArrayList<Athlete> setParticipantes(){
        return participants;
    }


}
