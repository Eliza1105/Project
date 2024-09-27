package holidayservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Table(name = "coctails")
@Entity
@Getter
@Setter
public class Coctails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coctail", updatable = false, nullable = false, unique=true)
    private Integer id;
    @Column(name = "coctail_name")
    private String name;
    @Column(name = "id_alcohol")
    private Integer idalcohol ;
    @Column(name = "id_alcoholfree")
    private Integer idalcoholfree;
    @Column(name = "coctail_description")
    private String description;

}
