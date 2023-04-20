package pl.ogrodnictwograbowscy.gardening.domain.type;

import pl.ogrodnictwograbowscy.gardening.domain.type.dto.TypeDto;

public class TypeDtoMapper {
    static TypeDto map(Type type) {
        return new TypeDto(
                type.getId(),
                type.getName(),
                type.getDescription()
        );
    }
}
