package Modulo2.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Race {
    private String id;
    private String localidad;
    private int kilometros;
    private LocalDateTime fechaHoraRegistro;
    private ArrayList<Athlete> participantes;

    public void show(){
        System.out.println("Race created --> Memory address: "+ this + " code: "+ getId()+ ", datetime: "+ getFechaHoraRegistro() );
    }

    public Race (String id , String localidad , int kilometros){
        this.id = id;
        this.localidad = localidad;
        this.kilometros = kilometros;
        participantes = new ArrayList<>();
        fechaHoraRegistro = LocalDateTime.now();
        show();
    }

    public String getId() {
        return id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getKilometros() {
        return kilometros;
    }

    public LocalDateTime getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public ArrayList<Athlete> getParticipantes() {
        return participantes;
    }

    public ArrayList<Athlete> setParticipantes(){
        return participantes;
    }


}
