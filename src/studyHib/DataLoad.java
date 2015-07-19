package studyHib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataLoad {
	
	public static void main(String args[]){
		
		/*Configuration cfg = new Configuration();
		cfg.configure("/META-INF/hibernate.cgf.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		tx.begin();*/
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    entityManager.getTransaction().begin();
	    
		for (int i = 200; i<=300; i++){
			Product p = new Product();
			//p.setProductId();
			p.setPrice(i+100);
			p.setProName("product"+i);	
			
			
			entityManager.persist(p);
			entityManager.flush();
			entityManager.clear();
			//session.save(p);
			
			//session.flush();
			//session.clear();
			System.out.println(p.getPrice()+"__"+p.getProName());
		//	session.save(p);
		}
		
		entityManager.getTransaction().commit();
		//session.close();
		entityManager.close();
		
		
		
		
	}

}
