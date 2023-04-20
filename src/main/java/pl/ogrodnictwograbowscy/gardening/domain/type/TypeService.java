package pl.ogrodnictwograbowscy.gardening.domain.type;

import org.springframework.stereotype.Service;
import pl.ogrodnictwograbowscy.gardening.domain.type.dto.TypeDto;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class TypeService {
    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }
    public Optional<TypeDto> findTypeByName(String name) {
        return typeRepository.findByNameIgnoreCase(name)
                .map(TypeDtoMapper::map);
    }

    public List<TypeDto> findAllTypes() {
        return StreamSupport.stream(typeRepository.findAll().spliterator(), false)
                .map(TypeDtoMapper::map)
                .toList();
    }
}
