package holidayservice.controller;

import holidayservice.models.Food;
import holidayservice.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;
    @GetMapping(value = "/foods")
    public String findAll(Model model){
        model.addAttribute("food", foodService.findAll());
        return "foods";
    }
    @GetMapping("/food-create")
    public String createFoodForm(Food food){
return "food-create";
    }
    @PostMapping(value = "/savefood")
    public String createFood(Food food){
        foodService.saveFood(food);
        return  "redirect:/foods";
    }
}
