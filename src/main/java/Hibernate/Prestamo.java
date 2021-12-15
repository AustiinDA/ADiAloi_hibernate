package Hibernate;

import java.sql.Date;

public class Prestamo {

    int idPrestamo, codigoLibro, codigoSocio;
    Date fechaInicio, fechaFin;

    //Constructor de los Prestamos

    public Prestamo(int idPrestamo, int codigoLibro, int codigoSocio, Date fechaInicio, Date fechaFin) {
        this.idPrestamo = idPrestamo;
        this.codigoLibro = codigoLibro;
        this.codigoSocio = codigoSocio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    //Getters y setters


    public int getIdPrestamo() {
        return idPrestamo;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "idPrestamo=" + idPrestamo +
                ", codigoLibro=" + codigoLibro +
                ", codigoSocio=" + codigoSocio +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
