package sk.springframework.skpetclinic.controllers.vet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.springframework.skpetclinic.services.impl.VetServiceMapImpl;

@Controller
public class VetController {


    @RequestMapping({"/vets","vets/index","vets/vetindex.html"})
    public String getVets(Model model){
        return "vets/vetindex";
    }
}
