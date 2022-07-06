package bxFormation.dbslide;

import bxFormation.dbslide.daos.StudentDao;
import bxFormation.dbslide.daos.SectionDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coursJPA");
        EntityManager manager = emf.createEntityManager();
        SectionDao sectionDao = new SectionDao(manager);
        StudentDao studentDao = new StudentDao(manager);

        //region CRUD SectionDao (en commentaire)
//        Section section = new Section(1111,"name",456);
//        System.out.println(sectionDao.getSectionById(1020));
//        System.out.println(sectionDao.getAllSections());
//        sectionDao.insert(section);
//        sectionDao.update(section);
//        sectionDao.delette(section);
        //endregion

        //region CRUD StudentDao (en commentaire)
//        Student student = new Student(28,"firstname","lastname",new Date(92, 06, 21),"fila",1111,100,"EF2022");
//        System.out.println(studentDao.getStudentById(1));
//        studentDao.getAllStudents().forEach(System.out::println);
//        studentDao.insert(student);
//        studentDao.update(student);
//        studentDao.delette(student);
        //endregion

        studentDao.transfertFromSectionToSection(sectionDao.getSectionById(1111), sectionDao.getSectionById(1020));
        emf.close();
    }
}
