package bxFormation.exoMarket.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "market")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Market {
    @Id
    private int id;
    private String name;
    private String street;
    private String city;
    private int number;
}
