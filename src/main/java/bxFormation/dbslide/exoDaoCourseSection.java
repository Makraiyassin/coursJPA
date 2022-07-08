//package bxFormation.dbslide;
//
//import bxFormation.dbslide.entities.Course;
//import bxFormation.dbslide.entities.Section;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//
//import java.util.List;
//
//public class exoDaoCourseSection {
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbslidePersist");
//        EntityManager manager = emf.createEntityManager();
//        Course c = manager.find(Course.class,"EG1010");
//        Section s = manager.find(Section.class,1020);
//
//        manager.getTransaction().begin();
//        s.setCourses(List.of(c));
////        c.setSections(List.of(s));
//        manager.getTransaction().commit();
//    }
//}
