package studyJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.spi.RootLogger;

import java.util.List;

public class TestDb {
    static{                // Static initializer
        BasicConfigurator.configure();
        RootLogger.getRootLogger().setLevel(Level.WARN);
    }

    public static void main(String[] args) throws Exception {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.corpinfo.model");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Add a new record to corporation
        Corporation corporation = new Corporation();
        corporation.setId(6);
        corporation.setName("Extra Corp");
        corporation.setDescription("Extra industrial multinational corporation");
        corporation.setAddress("555 Extra Way, Acropolis CA");
        corporation.setZipcode("90267");
        corporation.setPhone("1-800-555-1213");
        
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(corporation);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
             e.printStackTrace();
             entityManager.getTransaction().rollback();
        }

        try {
            Corporation corp3 = entityManager.find(Corporation.class, 3);
            System.out.println("Corp 3 name: " + corp3.getName() + " Zipcode: " + corp3.getZipcode());
            Corporation corp5 = entityManager.find(Corporation.class, 5);
            System.out.println("Corp 5 name: " + corp5.getName() + " Zipcode: " + corp5.getZipcode());
        } catch (RuntimeException e) {
             e.printStackTrace();
             entityManager.getTransaction().rollback();
        } finally {
             entityManager.close();
        }
    }
}

