package pl.piatekd.osrsprices.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.NaturalId;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Item {

    @Id
    private Long id;
    private int highPrice;
    private int highPriceTime;
    private int lowPrice;
    private int lowPriceTime;
    private long margin;
    private double percentageMargin;
//    @OneToOne
//    @JoinColumn(name = "id")
//    @JsonBackReference
//    private AdditionalInfo additionalInfo;

//    public AdditionalInfo getAdditionalInfo() {
//        return additionalInfo;
//    }
//
//    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
//        this.additionalInfo = additionalInfo;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(int highPrice) {
        this.highPrice = highPrice;
    }

    public int getHighPriceTime() {
        return highPriceTime;
    }

    public void setHighPriceTime(int highPriceTime) {
        this.highPriceTime = highPriceTime;
    }

    public int getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(int lowPrice) {
        this.lowPrice = lowPrice;
    }

    public int getLowPriceTime() {
        return lowPriceTime;
    }

    public void setLowPriceTime(int lowPriceTime) {
        this.lowPriceTime = lowPriceTime;
    }

    public long getMargin() {
        return margin;
    }

    public void setMargin(long margin) {
        this.margin = margin;
    }

    public double getPercentageMargin() {
        return percentageMargin;
    }

    public void setPercentageMargin(double percentageMargin) {
        this.percentageMargin = percentageMargin;
    }

    public Item() {
    }

    public Item(Long id, Integer highPrice, Integer highPriceTime, Integer lowPrice, Integer lowPriceTime) {
        this.id = id;
        this.highPrice = checkifNotNull(highPrice);
        this.highPriceTime = checkifNotNull(highPriceTime);
        this.lowPrice = checkifNotNull(lowPrice);
        this.lowPriceTime = checkifNotNull(lowPriceTime);
        long margin = setMargin(highPrice, lowPrice);
        double percentageMargin = setPercantageMargin(margin, highPrice);
        this.margin = margin;
        this.percentageMargin = percentageMargin;
    }

    private int checkifNotNull(Integer value) {
        if (value != null) {
            return value;
        } else {
            return 0;
        }
    }

    private long setMargin(Integer highPrice, Integer lowPrice){
        if(highPrice != null && lowPrice != null){
            return highPrice - lowPrice;
        }
        else return 0;
    }

    private double setPercantageMargin(long margin, Integer highPrice){
        if(margin!= 0 && highPrice!= 0 && highPrice != null){
            double percantageMargin = (double) margin/highPrice;
            return percantageMargin * 100;
        }
        else return 0;
    }
}
