package holidayservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Table(name = "marinades")
@Entity
@Getter
@Setter
public class Marinades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marinades")
    private Integer id;
    @Column(name = "marinades_name")
    private String name;
    @Column(name = "id_food")
    private Integer idfood;
    @Column(name = "marinades_description")
    private String description;

}
