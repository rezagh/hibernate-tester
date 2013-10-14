

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 * hibernate.cfg.xml is the hibernate way of starting up.
 * put the config in class path.
 * 
 * jpa uses persistence.xml
 * 
 *
 */
public class HibernatePlainTester {
	public static void main (String aregs[]){
	    SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.get(ParameterDO.class, 1l);
	    session.getTransaction().commit();
	    session.close();
	}
}
