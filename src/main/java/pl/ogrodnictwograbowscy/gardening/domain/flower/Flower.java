package pl.ogrodnictwograbowscy.gardening.domain.flower;

import jakarta.persistence.*;
import pl.ogrodnictwograbowscy.gardening.domain.type.Type;

@Entity
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String originalName;
    private String shortDescription;
    private String description;
    private Integer cultivationStart;
    private Integer cultivationEnd;
    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private Type type;
    private boolean popular;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCultivationStart() {
        return cultivationStart;
    }

    public void setCultivationStart(Integer cultivationStart) {
        this.cultivationStart = cultivationStart;
    }

    public Integer getCultivationEnd() {
        return cultivationEnd;
    }

    public void setCultivationEnd(Integer cultivationEnd) {
        this.cultivationEnd = cultivationEnd;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }
}
