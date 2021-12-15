package Hibernate;

public class Libro {

    int idLibro, codigoLibro, Ano, NumEjemplares, NumPaginas;
    String Titulo, Editorial, ISBN;

    //Constructor de los libros
    public Libro(int codigoLibro, int idLibro, String titulo, String editorial, String ISBN, int ano, int numEjemplares, int numPaginas) {
        this.codigoLibro = codigoLibro;
        this.idLibro = idLibro;
        Titulo = titulo;
        Editorial = editorial;
        this.ISBN = ISBN;
        Ano = ano;
        NumEjemplares = numEjemplares;
        NumPaginas = numPaginas;
    }

    //Getters y setters

    public int getIdLibro() {
        return idLibro;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getAno() {return Ano;}

    public void setAno(int ano) {
        Ano = ano;
    }

    public int getNumEjemplares() {
        return NumEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        NumEjemplares = numEjemplares;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", Codigo=" + codigoLibro +
                ", Año=" + Ano +
                ", NumEjemplares=" + NumEjemplares +
                ", NumPaginas=" + NumPaginas +
                ", Titulo='" + Titulo + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
