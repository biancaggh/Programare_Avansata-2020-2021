package lab9;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonConnection {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lab9_compulsory");

    public static SingletonConnection instance = new SingletonConnection();

    private SingletonConnection() {

    }

    public static void closeConnection(){
        entityManagerFactory.close();
    }

    public static EntityManager entityManager(){
        return entityManagerFactory.createEntityManager();
    }
}
