package bxFormation.yassin;

import bxFormation.yassin.entities.Section;
import bxFormation.yassin.daos.SectionDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coursJPA");
        EntityManager manager = emf.createEntityManager();
        SectionDao sectionDao = new SectionDao(manager);
        Section section = new Section(1111,"name",456);
//        System.out.println(sectionDao.getSectionWithId(1020));
//        System.out.println(sectionDao.getAllSections());
//        sectionDao.insert(section);
//        sectionDao.update(section);
//        sectionDao.delette(section);
        emf.close();
    }
}