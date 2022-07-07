package bxFormation.dbslide.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table (name = "section")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Section {
    @Id
    @Column(name="section_id")
    private int id;
    @Column(name="section_name")
    private String name;
    @Column(name="delegate_id")
    private int delegateId;

    @OneToMany(mappedBy = "section")
    List<Student> studentList;

    @ManyToMany
    @JoinTable(
            name = "course_section",
            joinColumns = @JoinColumn(name="section_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    @OneToOne
    private Student delegue;
}
