package Sesiones;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

    private static final SessionFactory sf;

    static {
        try {
            sf = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.out.println("Error al crear session factory");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sf;
    }

    public static void closeSessionFactory() {
        getSessionFactory().close();
    }
}
