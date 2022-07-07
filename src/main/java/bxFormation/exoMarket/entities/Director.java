package bxFormation.exoMarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "director")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Director {
    @Id
    @Column(name = "director_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private double salary;
    @OneToOne
    @JoinColumn(name = "market_id")
    private Market market;
}
