package Hibernate;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "prestamos", schema = "biblioteca", catalog = "")
public class Prestamo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPrestamo")
    private int idPrestamo;
    @Basic
    @Column(name = "codigoLibro")
    private int codigoLibro;
    @Basic
    @Column(name = "codigoSocio")
    private int codigoSocio;
    @Basic
    @Column(name = "fechaInicioPrestamo")
    private Date fechaInicioPrestamo;
    @Basic
    @Column(name = "fechaFinPrestamo")
    private Date fechaFinPrestamo;

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
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

    public Date getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }

    public void setFechaInicioPrestamo(Date fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
    }

    public Date getFechaFinPrestamo() {
        return fechaFinPrestamo;
    }

    public void setFechaFinPrestamo(Date fechaFinPrestamo) {
        this.fechaFinPrestamo = fechaFinPrestamo;
    }
}
