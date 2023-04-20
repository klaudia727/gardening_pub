package pl.ogrodnictwograbowscy.gardening.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
@GetMapping("/o-nas")
    public String about() {
        return "about";
    }
}
