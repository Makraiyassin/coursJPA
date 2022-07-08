//package bxFormation.dbslide.entities;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.time.LocalDate;
//import java.util.Date;
//
//@Entity
//@Table (name = "student")
//@Getter @Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//public class Student {
//    @Id
//    @Column(name="student_id")
//    private int id;
//    @Column(name="first_name")
//    private String firstName;
//    @Column(name="last_name")
//    private  String lastName;
//    @Column(name = "birth_date")
//    private Date birthDate;
//    @Column(name="login")
//    private  String login;
//    @ManyToOne
//    @JoinColumn(name = "section_id")
//    private Section section;
//    @Column(name = "year_result")
//    private int yearResult;
//    @Column(name="course_id")
//    private  String courseId;
//
////    @OneToOne
////    private Section delegueDe;
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", birthDate=" + birthDate +
//                ", login='" + login + '\'' +
//                ", section=" + (section == null ? null : section.getName()) +
//                ", yearResult=" + yearResult +
//                ", courseId='" + courseId + '\'' +
//                '}';
//    }
//
//}
