package Hibernate;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

//Creación de datos de las tablas, guardados en un Arraylist (objetos)
public class insercionDatos {

    public static ArrayList<Libro> libros = new ArrayList<>();
    public static ArrayList<Socio> socios = new ArrayList<>();
    public static ArrayList<Prestamo> prestamos = new ArrayList<>();

    public static void crearDatosTablas() {

        libros.add(new Libro(1,1, "El conde de monte cristo", "Frachueli", "43290-212B", 1846, 312, 720));
        libros.add(new Libro(2,2, "Robots e Imperio", "Plaza & Janes ", "8401321697", 1986, 12, 512));
        libros.add(new Libro(3,3, "El sol desnudo", " DEBOLS!LLO", "8497937856", 2019, 55, 288));
        libros.add(new Libro(4,4, "Tales Of Mystery And Imagination", "W&N", " 978-0460873420", 1993, 32, 640));
        libros.add(new Libro(5,5, "Paisajes y apariciones", "Libros del Zorro Rojo", " 8412061101", 2019, 53, 72));

        socios.add(new Socio(1,1, "Jackie", "Chan", "Hong Kong, Tin Wan, Yue Ko St, 1號Aberdeen 號地下", "8616532924932", Date.valueOf("1954-04-07")));
        socios.add(new Socio(2,2, "Hugh", "Jackman", "45 Blackwall Point Rd, Chiswick NSW 2046, Australia", "0491 570 156", Date.valueOf("1968-10-12")));
        socios.add(new Socio(3,3, "Neil", "Gaiman", "10 The Fairway, Portchester, Fareham PO16 8NS, Reino Unido", "01632 960980", Date.valueOf("1960-11-10")));

        prestamos.add(new Prestamo(1,1, 2, Date.valueOf("2019-04-02"), Date.valueOf("2021-12-12")));
        prestamos.add(new Prestamo(3,3, 1, Date.valueOf("2021-09-12"), Date.valueOf("2021-12-31")));
        prestamos.add(new Prestamo(5,5, 2, Date.valueOf("2021-10-15"), Date.valueOf("2021-11-1")));
        prestamos.add(new Prestamo(2,2, 0, Date.valueOf("2021-10-19"), Date.valueOf("2021-10-26")));

        System.out.println("-- Datos procesados --");

    }
    //Inserccion de la tabla Libros
    public static void insertarLibros() {
        //Abriendo y cerrando recursos usando un try con recursos. Gracias a esto no es necesario hacer close() en las conexiones
        try (Connection miCon = Conexion.conectar();PreparedStatement consulta = miCon.prepareStatement("INSERT IGNORE INTO libros(idLibro, codigoLibro, titulo, editorial, ISBN, ano, numEjemplares, numPaginas) VALUES(?,?, ?, ?, ?, ?, ?, ?)");) {
            for (Libro libro : libros) {
                consulta.setInt(1, libro.getIdLibro());
                consulta.setInt(2, libro.getCodigoLibro());
                consulta.setString(3, libro.getTitulo());
                consulta.setString(4, libro.getEditorial());
                consulta.setString(5, libro.getISBN());
                consulta.setInt(6, libro.getAno());
                consulta.setInt(7, libro.getNumEjemplares());
                consulta.setInt(8, libro.getNumPaginas());
                consulta.executeUpdate();

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //Inserccion de la tabla Socios
    public static void insertarSocios() {
        Connection miCon = Conexion.conectar();
        PreparedStatement consulta;

        try {
            for (Socio socio : socios) {
                consulta = miCon.prepareStatement("INSERT IGNORE INTO socios(idSocio, codigoSocio, nombre, apellidos, domicilio, telefono, fechaNacimiento) VALUES(?,?, ?, ?, ?, ?, ? )");
                consulta.setInt(1, socio.getIdSocio());
                consulta.setInt(2, socio.getCodigoSocio());
                consulta.setString(3, socio.getNombre());
                consulta.setString(4, socio.getApellidos());
                consulta.setString(5, socio.getDomicilio());
                consulta.setString(6, socio.getTelefono());
                consulta.setDate(7, socio.getFechaNacimiento());
                consulta.executeUpdate();
            }

            miCon.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //Inserccion de la tabla Prestamos
    public static void insertarPrestamo() {

        Connection miCon = Conexion.conectar();
        PreparedStatement consulta;

        try {
            for (Prestamo prestamo : prestamos) {
                consulta = miCon.prepareStatement("INSERT IGNORE INTO prestamos(idPrestamo, codigoLibro, codigoSocio, fechaInicioPrestamo, fechaFinPrestamo) VALUES(?,?, ?, ?, ?)");

                consulta.setInt(1, prestamo.getIdPrestamo());
                consulta.setInt(2, prestamo.getCodigoLibro());
                consulta.setInt(3, prestamo.getCodigoSocio());
                consulta.setDate(4, prestamo.getFechaInicio());
                consulta.setDate(5, prestamo.getFechaFin());
                consulta.executeUpdate();

            }
            miCon.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
