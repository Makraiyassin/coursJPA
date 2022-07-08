package bxFormation.exoMarket.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "aisle")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Aisle {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String type;
    @ManyToOne
    @JoinColumn(name = "market_id")
    private Market market;

    public Aisle(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Aisle{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
