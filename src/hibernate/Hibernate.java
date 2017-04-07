


package hibernate;
import entidades.usuario;
import org.hibernate.Session;

public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        usuario usuario=new usuario();
        usuario.setNombre("Mario".trim());
        usuario.setApellido("Pradenas".trim());
        
        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
      
        sesion.beginTransaction();
        sesion.save(usuario);
        sesion.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();
        
    }
    
}
