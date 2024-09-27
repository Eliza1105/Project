package holidayservice.service;

import holidayservice.models.Food;
import holidayservice.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;
    public List<Food> findAll(){ return  foodRepository.findAll();}
public Optional<Food> findById(Integer id) {return  foodRepository.findById(id);}
    public Food saveFood(Food food) {return  foodRepository.save(food);}
    public void deleteById(Integer id){foodRepository.deleteById(id);}
}