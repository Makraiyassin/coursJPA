package bxFormation.yassin.daos;

import bxFormation.yassin.entities.Section;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class SectionDao {
    EntityManager manager;

    public SectionDao(EntityManager manager) {
        this.manager = manager;
    }

    public Section getSectionById(int id){
        return manager.find(Section.class, id);
    }

    public List<Section> getAllSections() {
        return manager.createNativeQuery("SELECT * FROM section",Section.class).getResultList();
    }

    public void insert(Section section) {
        manager.getTransaction().begin();
        manager.persist(section);
        manager.getTransaction().commit();
    }
    public void update(Section section) {
        manager.getTransaction().begin();
//        Section sectionToUpdate = getSectionWithId(section.getId());
//        sectionToUpdate.setName(section.getName());
//        sectionToUpdate.setDelegateId(section.getDelegateId());
        manager.merge(section);
        manager.getTransaction().commit();
    }

    public void delette(Section section) {
        Section sectionToDelette = getSectionById(section.getId());
        manager.getTransaction().begin();
        manager.remove(sectionToDelette);
        manager.getTransaction().commit();
    }
}
