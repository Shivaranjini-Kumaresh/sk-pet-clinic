package sk.springframework.skpetclinic.controllers.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.springframework.skpetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService service;

    public OwnerController(OwnerService service) {
        this.service = service;
    }

    @RequestMapping({"/","/ownerindex" , "/ownerindex.html"})
    public String getOwners(Model model){
        model.addAttribute("owners",service.findAll());
        return "owners/ownerindex";
    }
}
