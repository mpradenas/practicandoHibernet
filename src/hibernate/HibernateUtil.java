package hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    
    public static final SessionFactory sessionFactory=buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private static SessionFactory buildSessionFactory() {
   
        try
        {
            
            Configuration configuration=new Configuration();
            configuration.configure("hibernate.cfg.xml");
            ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;       
        }
        catch(Throwable e)
        {
              System.err.println("Error de conexion de session factory"+e);
              throw new ExceptionInInitializerError();
        }
    }
    
    
    
    
}
