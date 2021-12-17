package Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "libros", schema = "biblioteca", catalog = "")
public class Libro {
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
}
