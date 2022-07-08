package bxFormation.exoMarket;

import bxFormation.exoMarket.entities.Market;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("marketdbPersist");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(new Market("inno","rue Neuve","Bruxelles",1));
        manager.getTransaction().commit();
    }
}
