package Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "libros", schema = "biblioteca", catalog = "")
public class LibrosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idLibro")
    private int idLibro;
    @Basic
    @Column(name = "codigoLibro")
    private int codigoLibro;
    @Basic
    @Column(name = "Titulo")
    private String titulo;
    @Basic
    @Column(name = "Editorial")
    private String editorial;
    @Basic
    @Column(name = "Ano")
    private Integer ano;
    @Basic
    @Column(name = "ISBN")
    private String isbn;
    @Basic
    @Column(name = "NumEjemplares")
    private Integer numEjemplares;
    @Basic
    @Column(name = "NumPaginas")
    private Integer numPaginas;

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(Integer numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibrosEntity that = (LibrosEntity) o;

        if (idLibro != that.idLibro) return false;
        if (codigoLibro != that.codigoLibro) return false;
        if (titulo != null ? !titulo.equals(that.titulo) : that.titulo != null) return false;
        if (editorial != null ? !editorial.equals(that.editorial) : that.editorial != null) return false;
        if (ano != null ? !ano.equals(that.ano) : that.ano != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (numEjemplares != null ? !numEjemplares.equals(that.numEjemplares) : that.numEjemplares != null)
            return false;
        if (numPaginas != null ? !numPaginas.equals(that.numPaginas) : that.numPaginas != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLibro;
        result = 31 * result + codigoLibro;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (editorial != null ? editorial.hashCode() : 0);
        result = 31 * result + (ano != null ? ano.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (numEjemplares != null ? numEjemplares.hashCode() : 0);
        result = 31 * result + (numPaginas != null ? numPaginas.hashCode() : 0);
        return result;
    }
}
