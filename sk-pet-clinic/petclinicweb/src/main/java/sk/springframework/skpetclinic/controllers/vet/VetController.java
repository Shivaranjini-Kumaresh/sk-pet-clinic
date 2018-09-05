package sk.springframework.skpetclinic.controllers.vet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.springframework.skpetclinic.services.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets","vets/index","vets/vetindex.html"})
    public String getVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/vetindex";
    }
}
