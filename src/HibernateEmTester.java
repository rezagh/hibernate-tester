

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * EntityManager and persistence.xml is the jpa way of doing this.
 * You have to put your persistence.xml in the correct place probably in META-INF
 * 
 *
 */
public class HibernateEmTester {
	public static void main (String aregs[]){
		
		    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "test" );
		    
		    EntityManager entityManager = entityManagerFactory.createEntityManager();
		    entityManager.getTransaction().begin();
		    
		    
		    entityManager.find(ParameterDO.class, 1l);
		    
		    
		    entityManager.getTransaction().commit();
		    entityManager.close();		    
		    

	}
}
