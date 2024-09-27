package holidayservice.controller;

import holidayservice.models.Alcohol;
import holidayservice.models.Alcoholfree;
import holidayservice.service.AlcoholfreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AlcoholfreeController {
    private final AlcoholfreeService alcoholfreeService;
    @GetMapping(value = "alcoholfree")
    public String findAll(Model model){
        List<Alcoholfree> alcoholfrees=null;
        model.addAttribute("alcoholfrees", alcoholfrees);
        return "alcoholfreeList";
    }
    @GetMapping("/createalcofree")
    public String saveAlcoholFreeForm(Alcoholfree alcoholfree){
        return "alcoholfree-create";
    }
    @PostMapping(value = "/savealcofree")

    public String saveAlcoholFree(Alcoholfree alcoholfree){
alcoholfreeService.saveAlcoholfree(alcoholfree);
        return  "redirect:/alcoholfree";
    }
}
