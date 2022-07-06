package bxFormation.dbslide.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table (name = "student")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @Column(name="student_id")
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private  String lastName;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name="login")
    private  String login;
    @Column(name = "section_id")
    private int sectionId;
    @Column(name = "year_result")
    private int yearResult;
    @Column(name="course_id")
    private  String courseId;
}
