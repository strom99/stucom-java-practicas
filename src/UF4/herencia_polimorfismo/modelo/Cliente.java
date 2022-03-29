package UF4.herencia_polimorfismo.modelo;

import java.util.Date;

public class Cliente extends Persona{
    protected  int idCliente;
    protected Date fechaRegistro;
    protected  boolean vip;

    public Cliente(String nombre , String  direccion , char genero , int edad , int idCliente,boolean vip){
        super(nombre,direccion,genero,edad);
        this.idCliente = idCliente;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", idCliente= "+ idCliente +
                ", fecha registro= "+ fechaRegistro +
                ", vip = "+ vip;
    }
}
