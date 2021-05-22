package lab9;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {
    public static void create(Movie movie) {
        EntityManager entityManager = SingletonConnection.entityManager();

        EntityTransaction entityTransaction = null;

        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(movie);

            entityTransaction.commit();
        } catch (Exception e) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }
    }

    public static Movie findById(Integer ID) {
        EntityManager entityManager = SingletonConnection.entityManager();
        TypedQuery<Movie> query = entityManager.createNamedQuery("Movie.findById", Movie.class);
        query.setParameter("ID", ID);
        Movie resault = null;

        try {
            resault = query.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
        return resault;
    }

    public static List<Movie> findByTitle(String Title) {
        EntityManager entityManager = SingletonConnection.entityManager();

        TypedQuery<Movie> query = entityManager.createNamedQuery("Movie.findByTitle", Movie.class);
        query.setParameter("Title", Title);

        List<Movie> resault = new ArrayList<>();

        try{
            resault = query.getResultList();
        } catch (NoResultException e){
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
        return resault;
    }
}
