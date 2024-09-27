package holidayservice.repository;

import holidayservice.models.Alcoholfree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlcoholfreeRepository extends JpaRepository<Alcoholfree, Integer> {
}
