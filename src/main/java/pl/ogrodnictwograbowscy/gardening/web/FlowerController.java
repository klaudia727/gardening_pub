package pl.ogrodnictwograbowscy.gardening.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import pl.ogrodnictwograbowscy.gardening.domain.flower.FlowerService;
import pl.ogrodnictwograbowscy.gardening.domain.flower.dto.FlowerDto;

import java.util.Optional;

@Controller
public class FlowerController {
    private final FlowerService flowerService;


    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    @GetMapping("/kwiat/{id}")
    public String getFlower(@PathVariable long id, Model model) {
        FlowerDto flower = flowerService.findFlowerById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//        Optional<FlowerDto> optionalFlower = flowerService.findFlowerById(id);
//        optionalFlower.ifPresent(flower -> model.addAttribute("flower", flower));
        model.addAttribute("flower", flower);
        return "flower";
    }
}
