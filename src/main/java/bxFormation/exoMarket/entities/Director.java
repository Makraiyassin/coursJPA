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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    private double salary;
    @OneToOne
    @JoinColumn(name = "market_id")
    private Market market;
}
