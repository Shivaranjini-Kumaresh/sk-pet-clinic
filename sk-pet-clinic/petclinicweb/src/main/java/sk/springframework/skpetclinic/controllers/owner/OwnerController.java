package sk.springframework.skpetclinic.controllers.owner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"/","/ownerindex" , "/ownerindex.html"})
    public String getOwners(){
        return "owners/ownerindex";
    }
}
