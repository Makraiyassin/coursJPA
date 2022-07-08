package bxFormation.exoMarket.entities;

import jakarta.persistence.*;
import jdk.jfr.MemoryAddress;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "market")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
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
        this.productList = new ArrayList<>();
        this.aisleList = new ArrayList<>();
    }


}
