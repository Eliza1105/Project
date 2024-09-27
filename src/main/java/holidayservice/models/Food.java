package holidayservice.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "foods")
@Entity
@Getter
@Setter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_food")
    private Integer id;
@Column(name = "food_name")
    private String name;
    @Column(name = "food_description")
        private String description;
    @Column(name = "food_unit")
    private double unit;

    @OneToMany()
    @JoinColumn(name = "id_food")
    List<Marinades> marinades=new ArrayList<>();
}
