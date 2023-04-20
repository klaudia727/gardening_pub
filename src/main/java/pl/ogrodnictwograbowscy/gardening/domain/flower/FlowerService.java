package pl.ogrodnictwograbowscy.gardening.domain.flower;

import org.springframework.stereotype.Service;
import pl.ogrodnictwograbowscy.gardening.domain.flower.dto.FlowerDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FlowerService {

    private final FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<FlowerDto> findAllPopularFlowers() {
        return flowerRepository.findAllByPopularIsTrue().stream()
                .map(FlowerDtoMapper::map)
                .toList();
    }
    public List<FlowerDto> findAllCurrentFlowers() {
        Iterable<Flower> flowers = flowerRepository.findAll();
        List<Flower> list = new ArrayList<>();
        int month = LocalDate.now().getMonth().getValue();
        for (Flower f : flowers) {
            boolean cultivationTime = f.getCultivationStart() <= month && f.getCultivationEnd() >= month;
            if (cultivationTime) {
                list.add(f);
            }
        }
        return list.stream()
                .map(FlowerDtoMapper::map)
                .toList();

    }

    public Optional<FlowerDto> findFlowerById(long id) {
        return flowerRepository.findById(id).map(FlowerDtoMapper::map);
    }
    public List<FlowerDto> findMoviesByTypeName(String type) {
        return flowerRepository.findAllByType_NameIgnoreCase(type)
                .stream()
                .map(FlowerDtoMapper::map)
                .toList();
    }
}
