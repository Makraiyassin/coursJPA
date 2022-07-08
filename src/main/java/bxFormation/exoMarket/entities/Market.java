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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String street;
    private String city;
    private int number;

    @ManyToMany
    @JoinTable(
            name = "market_product",
            joinColumns = @JoinColumn(name="market_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> productList;
    @OneToMany(mappedBy = "market")
    private List<Aisle> aisleList;
    @OneToOne(mappedBy = "market")
    private Director director;

    public Market(String name, String street, String city, int number) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.number = number;
        this.aisleList = aisleList;
        this.director = director;
    }
}
