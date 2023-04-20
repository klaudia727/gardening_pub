package pl.ogrodnictwograbowscy.gardening.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import pl.ogrodnictwograbowscy.gardening.domain.flower.FlowerService;
import pl.ogrodnictwograbowscy.gardening.domain.flower.dto.FlowerDto;
import pl.ogrodnictwograbowscy.gardening.domain.type.TypeService;
import pl.ogrodnictwograbowscy.gardening.domain.type.dto.TypeDto;

import java.util.List;

@Controller
public class TypeController {
    private final TypeService typeService;
    private final FlowerService flowerService;

    public TypeController(TypeService typeService, FlowerService flowerService) {
        this.typeService = typeService;
        this.flowerService = flowerService;
    }
    @GetMapping("/kategoria/{name}")
    public String getType(@PathVariable String name, Model model) {
        TypeDto type = typeService.findTypeByName(name)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        List<FlowerDto> flowers = flowerService.findMoviesByTypeName(name);
        model.addAttribute("heading", type.getName());
        model.addAttribute("description", type.getDescription());
        model.addAttribute("flowers", flowers);
        return "index";
    }
@GetMapping("/kategorie")
    public String getTypeList(Model model) {
        List<TypeDto> types = typeService.findAllTypes();
        model.addAttribute("types", types);
        return "type-listing";
    }
}
