//package bxFormation.dbslide.entities;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//
//@PersistenceContext(unitName = "dbslidePersist")
//@Entity
//@Table(name = "course")
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter @Setter
//public class Course {
//    @Id
//    @Column(name="course_id")
//    private String id;
//    @Column(name = "course_name")
//    private String name;
//    @Column(name = "course_ects", columnDefinition = "DECIMAL(3,1)")
//    private double ects;
//    @Column(name="professor_id")
//    private int profId;
//    @ManyToMany(mappedBy = "courses")
//    private List<Section> sections;
//
//}
