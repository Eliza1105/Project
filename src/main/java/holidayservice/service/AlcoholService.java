package holidayservice.service;

import holidayservice.models.Alcohol;
import holidayservice.repository.AlcoholRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlcoholService {
    private final AlcoholRepository alcoholRepository;

    public List<Alcohol> findAll(){return alcoholRepository.findAll();}
    public Optional<Alcohol> findById(Integer id){return alcoholRepository.findById(id);}
    public void saveAlcohol(Alcohol alcohol){ alcoholRepository.save(alcohol);}
    public void delById(Integer id){ alcoholRepository.deleteById(id);}

}
