package pl.piatekd.osrsprices.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemVolume {

    @Id
    private Long id;
    private Integer timestamp;
    private Long dailyTraded;

    public ItemVolume() {
    }

    public ItemVolume(Long id, Integer timestamp, Long dailyTraded) {
        this.id = id;
        this.timestamp = timestamp;
        this.dailyTraded = dailyTraded;
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

    public Long getDailyTraded() {
        return dailyTraded;
    }

    public void setDailyTraded(Long dailyTraded) {
        this.dailyTraded = dailyTraded;
    }
}
