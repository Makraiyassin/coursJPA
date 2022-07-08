package bxFormation.exoMarket.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Product {
    @Id
    private String id;
    private String name;
    private String brand;
    @Column(columnDefinition = "DECIMAL(8,2)")
    private double price;
    @ManyToMany
    @JoinTable(
            name = "market_product",
            joinColumns = @JoinColumn(name="product_id"),
            inverseJoinColumns = @JoinColumn(name = "market_id")
    )
    private List<Market> marketList;

    public Product(String id, String name, String brand, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.marketList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
