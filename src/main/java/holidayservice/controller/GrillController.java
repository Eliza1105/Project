package holidayservice.controller;

import holidayservice.models.Grill;
import holidayservice.repository.GrillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GrillController {
    @Autowired
    private GrillRepository grillRepository;
    @GetMapping("/grill")
    public  String blogMain(Model model){
        Iterable<Grill> grills = grillRepository.findAll();
        model.addAttribute("grills", grills);
        return "blogMain";
    }
}
