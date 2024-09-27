package holidayservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "alcohol")
@Entity
@Getter
@Setter
public class Alcohol {

@Id
@Column(name = "id_alcohol")
@GenericGenerator(name = "generator", strategy = "increment")
@GeneratedValue(generator = "generator")
    private Integer id;
@Column(name = "alcohol_name")
private String name;
    @Column(name = "alcohol_unit")
    private double unit;
    @Column(name = "alcohol_description")
    private String description;

    @OneToMany()
    @JoinColumn(name = "id_alcohol")
    List<Coctails> coctails=new ArrayList<>();
}
