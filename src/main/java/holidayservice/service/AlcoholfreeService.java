package holidayservice.service;

import holidayservice.models.Alcohol;
import holidayservice.models.Alcoholfree;
import holidayservice.repository.AlcoholfreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlcoholfreeService {
    private final AlcoholfreeRepository alcoholfreeRepository;

    public List<Alcoholfree> findAll(){return alcoholfreeRepository.findAll();}
    public Optional<Alcoholfree> findById(Integer id){return alcoholfreeRepository.findById(id);}
    public void saveAlcoholfree(Alcoholfree alcoholfree){ alcoholfreeRepository.save(alcoholfree);}
    public void delById(Integer id){ alcoholfreeRepository.deleteById(id);}
}
