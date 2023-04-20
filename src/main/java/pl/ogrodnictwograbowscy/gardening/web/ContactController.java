package pl.ogrodnictwograbowscy.gardening.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    @GetMapping("/kontakt")
    public String showContact() {

        return "contact";
    }
}
