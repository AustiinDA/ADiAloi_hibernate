package Sesiones;

import Hibernate.Libro;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Consultillas {
    public static void main(String[] args) {
        Session sesion = SessionFactoryUtil.getSessionFactory().openSession();
        Libro libroaux = new Libro();
        Libro libroNuevo = new Libro();
        // libroNuevo = new Libro(10, )
        Transaction tx = sesion.beginTransaction();

        libroaux = sesion.get(Libro.class, 1);
        if (libroaux != null) {
            System.out.println("libro :" + libroaux.getTitulo());
        } else {
            System.out.println("El libro no existe");
        }
        sesion.close();
        //Si existe

        if (libroaux == null) {
            sesion.save(libroNuevo);
        }


        //Listado
        sesion = SessionFactoryUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
        List<Libro> libros = (List<Libro>) sesion.createQuery("from Libro ").list();
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}
