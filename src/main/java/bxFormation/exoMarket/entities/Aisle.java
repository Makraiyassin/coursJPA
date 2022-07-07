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
@Table(name = "aisle")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Aisle {
    @Id
    @Column(name = "aisle_id")
    private int id;
    private String type;
}
