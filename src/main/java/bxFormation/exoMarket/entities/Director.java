package bxFormation.exoMarket.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "director")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Director {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(columnDefinition = "DECIMAL(8,2)")
    private double salary;
    @OneToOne
    @JoinColumn(name = "market_id")
    private Market market;

    public Director(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

