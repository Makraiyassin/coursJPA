package bxFormation.exoMarket.daos;

import bxFormation.exoMarket.entities.Product;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ProductDao {
    private EntityManager manager;
    public ProductDao(EntityManager manager) {
        this.manager = manager;
    }

    public Product getById(String  id){
        return manager.find(Product.class, id);
    }
    public List<Product> getAll(){
        return manager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }
    public void insert(Product product){
        manager.getTransaction().begin();
        manager.persist(product);
        manager.getTransaction().commit();
    }
}
