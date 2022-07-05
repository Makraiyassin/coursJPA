package bxFormation.yassin;

import bxFormation.yassin.entities.Section;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coursJPA");
        EntityManager manager = emf.createEntityManager();

        System.out.println(manager.find(Section.class,1020));
        emf.close();
    }
}