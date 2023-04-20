package pl.ogrodnictwograbowscy.gardening.domain.flower;

import pl.ogrodnictwograbowscy.gardening.domain.flower.dto.FlowerDto;

public class FlowerDtoMapper {
    static FlowerDto map(Flower flower) {
        return new FlowerDto(
                flower.getId(),
                flower.getName(),
                flower.getOriginalName(),
                flower.getShortDescription(),
                flower.getDescription(),
                flower.getCultivationStart(),
                flower.getCultivationEnd(),
                flower.getType().getName(),
                flower.isPopular()
        );
    }
}
