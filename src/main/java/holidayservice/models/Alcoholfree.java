package holidayservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "alcoholfree")
@Entity
@Getter
@Setter
public class Alcoholfree {
    @Id
    @Column(name = "id_alcoholfree")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;
    @Column(name = "alcoholfree_name")
    private String name;
    @Column(name = "alcoholfree_unit")
    private double unit;
    @Column(name = "alcoholfree_description")
    private String description;

    @OneToMany()
    @JoinColumn(name = "id_alcoholfree")
    List<Coctails> coctails=new ArrayList<>();
}
