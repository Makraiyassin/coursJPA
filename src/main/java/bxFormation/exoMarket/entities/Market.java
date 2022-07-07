package bxFormation.exoMarket.entities;

import jakarta.persistence.*;
import jdk.jfr.MemoryAddress;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "market")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Market {
    @Id
    @Column(name = "market_id")
    private int id;
    private String name;
    private String street;
    private String city;
    private int number;

    @OneToMany(mappedBy = "market")
    private List<Aisle> aisleList;
    @OneToOne
    private Director director;

}
