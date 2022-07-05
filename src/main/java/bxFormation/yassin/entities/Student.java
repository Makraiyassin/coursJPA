package bxFormation.yassin.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

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
    private String name;
    @Column(name="last_name")
    private  String lastName;
}
