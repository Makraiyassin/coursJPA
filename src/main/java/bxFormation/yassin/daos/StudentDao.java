package bxFormation.yassin.daos;

import bxFormation.yassin.entities.Section;
import bxFormation.yassin.entities.Student;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentDao {
    EntityManager manager;

    public StudentDao(EntityManager manager) {
        this.manager = manager;
    }

    public Student getStudentById(int id){
        return manager.find(Student.class, id);
    }

    public List<Student> getAllStudents() {
//        return manager.createNativeQuery("SELECT * FROM student", Student.class).getResultList();
        return manager.createQuery("SELECT s FROM Student s",Student.class).getResultList();
    }
    public void insert(Student student) {
        manager.getTransaction().begin();
        manager.persist(student);
        manager.getTransaction().commit();
    }
    public void update(Student student) {
        manager.getTransaction().begin();
//        Student studentToUpdate = getStudentById(student.getId());
//        studentToUpdate.setFirstName(student.getFirstName());
        manager.merge(student);
        manager.getTransaction().commit();
    }
    public void delette(Student student) {
        Student studentToDelette = getStudentById(student.getId());
        manager.getTransaction().begin();
        manager.remove(studentToDelette);
        manager.getTransaction().commit();
    }

    public void transfertFromSectionToSection(Section s1, Section s2){
        List<Student> students = manager.createQuery(
                """
                    SELECT s FROM Student s
                    WHERE s.id = 
                """+s1.getId(),
                Student.class
        )
                .getResultList();
        students.forEach(student->{
            manager.getTransaction().begin();
            Student studentToUpdate = getStudentById(student.getId());
            studentToUpdate.setSectionId(s2.getId());
            manager.getTransaction().commit();
        });
    }


}
