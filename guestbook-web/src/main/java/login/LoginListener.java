package login;


import javax.persistence.*;
import javax.servlet.*;

public class LoginListener  implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent e) {
        com.objectdb.Enhancer.enhance("user.*");
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("$objectdb/db/guest.odb");
        e.getServletContext().setAttribute("emf", emf);
    }
 
    // Release the EntityManagerFactory:
    public void contextDestroyed(ServletContextEvent e) {
        EntityManagerFactory emf =
            (EntityManagerFactory)e.getServletContext().getAttribute("emf");
        emf.close();
    }

}
