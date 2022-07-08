package bxFormation.exoMarket.daos;

import bxFormation.exoMarket.entities.Market;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MarketDao {
    private EntityManager manager;
    public MarketDao(EntityManager manager) {
        this.manager = manager;
    }

    public Market getById(int id){
        return manager.find(Market.class, id);
    }
    public List<Market> getAll(){
        return manager.createQuery("SELECT m FROM Market m", Market.class).getResultList();
    }
    public void insert(Market market){
        manager.getTransaction().begin();
        manager.persist(market);
        manager.getTransaction().commit();
    }
}
