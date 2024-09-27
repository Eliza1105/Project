package holidayservice.controller;

import holidayservice.models.Alcohol;
import holidayservice.models.Food;
import holidayservice.service.AlcoholService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AlcoholController {
    private final AlcoholService alcoholService;

    @GetMapping(value = "alcohol")
    public String findAll(Model model){
        List<Alcohol> alcohols=null;
        model.addAttribute("alcohols", alcohols);
        return "alcoholList";
    }
    @GetMapping("/create/alco")
    public String createAlcoholForm(Alcohol alcohol){
        return "alcohol-create";
    }
    @PostMapping(value = "/savealco")
    public String createAlcohol(Alcohol alcohol){
        alcoholService.saveAlcohol(alcohol);
        return  "redirect:/alcohol";
    }
}
