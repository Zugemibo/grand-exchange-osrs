package pl.piatekd.osrsprices.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemVolume {

    @Id
    private Long id;
    private Integer timestamp;
    private Long volume;

    public ItemVolume() {
    }

    public ItemVolume(Long id, Integer timestamp, Long volume) {
        this.id = id;
        this.timestamp = timestamp;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }
}
