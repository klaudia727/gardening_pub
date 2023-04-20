package pl.ogrodnictwograbowscy.gardening.domain.flower;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlowerRepository extends CrudRepository<Flower, Long> {
    List<Flower> findAllByPopularIsTrue();
    List<Flower> findAllByType_NameIgnoreCase(String type);

}
