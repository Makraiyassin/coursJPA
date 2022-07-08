//package bxFormation.dbslide.daos;
//
//import bxFormation.dbslide.entities.Section;
//import jakarta.persistence.*;
//
//import java.util.List;
//
//public class SectionDao {
//    EntityManager manager;
//
//    public SectionDao(EntityManager manager) {
//        this.manager = manager;
//    }
//
//    public Section getSectionById(int id){
//        return manager.find(Section.class, id);
//    }
//
//    public List<Section> getAllSections() {
//        return manager.createNativeQuery("SELECT * FROM section",Section.class).getResultList();
//    }
//
//    public void insert(Section section) {
//        try {
//            manager.getTransaction().begin();
//            manager.persist(section);
//            manager.getTransaction().commit();
//        }
//        catch (RollbackException ex){
//            throw new EntityExistsException("this section already exist in db");
//        }
//    }
//
//    public void update(Section section) {
//        if( section == null )
//            throw new IllegalArgumentException("section cannot be null");
//
//        if( !existsById(section.getId()) )
//            throw new EntityNotFoundException("Entity not found");
//
//        manager.getTransaction().begin();
//        manager.merge(section);
//        manager.getTransaction().commit();
//    }
//
//    public Section delette(Section section) {
//        manager.getTransaction().begin();
//        Section sectionToDelette = getSectionById(section.getId());
//        manager.remove(sectionToDelette);
//        manager.getTransaction().commit();
//        return sectionToDelette;
//    }
//
//    public Section delette(int id) {
//        manager.getTransaction().begin();
//        Section sectionToDelette = getSectionById(id);
//        manager.remove(sectionToDelette);
//        manager.getTransaction().commit();
//        return sectionToDelette;
//    }
//
//    public boolean existsById(int id){
//        TypedQuery<Integer> query = manager.createQuery("SELECT COUNT(s) FROM Section s WHERE s.id = " + id, Integer.class);
//        return query.getSingleResult() > 0;
//    }
//}
