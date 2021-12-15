package Hibernate;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "prestamos", schema = "biblioteca", catalog = "")
public class PrestamosEntity {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrestamosEntity that = (PrestamosEntity) o;

        if (idPrestamo != that.idPrestamo) return false;
        if (codigoLibro != that.codigoLibro) return false;
        if (codigoSocio != that.codigoSocio) return false;
        if (fechaInicioPrestamo != null ? !fechaInicioPrestamo.equals(that.fechaInicioPrestamo) : that.fechaInicioPrestamo != null)
            return false;
        if (fechaFinPrestamo != null ? !fechaFinPrestamo.equals(that.fechaFinPrestamo) : that.fechaFinPrestamo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrestamo;
        result = 31 * result + codigoLibro;
        result = 31 * result + codigoSocio;
        result = 31 * result + (fechaInicioPrestamo != null ? fechaInicioPrestamo.hashCode() : 0);
        result = 31 * result + (fechaFinPrestamo != null ? fechaFinPrestamo.hashCode() : 0);
        return result;
    }
}
