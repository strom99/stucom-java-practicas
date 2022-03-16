package UF4.herencia_polimorfismo.modelo;

import java.util.Date;

public class Cliente extends Persona{
    int idCliente;
    Date fechaRegistro;
    boolean vip;

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
}
