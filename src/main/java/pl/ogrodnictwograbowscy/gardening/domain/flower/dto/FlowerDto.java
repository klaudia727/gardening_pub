package pl.ogrodnictwograbowscy.gardening.domain.flower.dto;

public class FlowerDto {
    private Long id;
    private String name;
    private String originalName;
    private String shortDescription;
    private String description;
    private Integer cultivationStart;
    private Integer cultivationEnd;
    private String type;
    private boolean popular;

    public FlowerDto(Long id, String name, String originalName, String shortDescription, String description, Integer cultivationStart, Integer cultivationEnd, String type, boolean popular) {
        this.id = id;
        this.name = name;
        this.originalName = originalName;
        this.shortDescription = shortDescription;
        this.description = description;
        this.cultivationStart = cultivationStart;
        this.cultivationEnd = cultivationEnd;
        this.type = type;
        this.popular = popular;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }
}
