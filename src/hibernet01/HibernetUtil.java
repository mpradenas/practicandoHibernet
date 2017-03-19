/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernet01;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Gamalyon
 */
public class HibernetUtil {
    
    public static final SessionFactory sessionFactory=buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
   
        try
        {
            Configuration configuration=new Configuration();
            configuration.configure("hibernate.cfg.xml");
            
        }
        catch
        {
        
        }
    }
    
    
    
    
}
