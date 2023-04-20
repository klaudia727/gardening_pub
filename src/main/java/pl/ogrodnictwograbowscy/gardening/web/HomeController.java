package pl.ogrodnictwograbowscy.gardening.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.ogrodnictwograbowscy.gardening.domain.flower.FlowerService;
import pl.ogrodnictwograbowscy.gardening.domain.flower.dto.FlowerDto;

import java.time.LocalDate;
import java.util.List;

@Controller
public class HomeController {
    private final FlowerService flowerService;

    public HomeController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    @GetMapping("/")
    public String home(Model model) {
        List<FlowerDto> popularFlowers = flowerService.findAllCurrentFlowers();
        model.addAttribute("heading", "W sprzedaży");
        model.addAttribute("description", "Rośliny, które aktualnie sprzedajemy");
        model.addAttribute("flowers", popularFlowers);
        return "index";
    }
}
