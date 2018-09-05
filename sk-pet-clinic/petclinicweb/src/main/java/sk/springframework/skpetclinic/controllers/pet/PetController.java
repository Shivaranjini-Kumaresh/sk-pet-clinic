package sk.springframework.skpetclinic.controllers.pet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetController {

    @RequestMapping({"","/","/petindex","/petindex.html"})
    public String getPets(){
        return "pets/petindex";
    }
}
