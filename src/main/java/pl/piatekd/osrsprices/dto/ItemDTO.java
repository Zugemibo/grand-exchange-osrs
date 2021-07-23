package pl.piatekd.osrsprices.dto;

import pl.piatekd.osrsprices.util.TimeConverter;

public class ItemDTO {

    private String name;
    private int itemHighPrice;
    private String itemHighPriceTime;
    private int itemLowPrice;
    private String itemLowPriceTime;
    private long margin;
    private double percentageMargin;


    public ItemDTO() {
    }

    public ItemDTO(String name, int itemHighPrice, int itemHighPriceTime, int itemLowPrice, int itemLowPriceTime, long margin, double percentageMargin) {
        this.name = name;
        this.itemHighPrice = itemHighPrice;
        this.itemHighPriceTime = TimeConverter.timestampToDate(itemHighPriceTime);
        this.itemLowPrice = itemLowPrice;
        this.itemLowPriceTime = TimeConverter.timestampToDate(itemLowPriceTime);
        this.margin = margin;
        this.percentageMargin = percentageMargin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemHighPrice() {
        return itemHighPrice;
    }

    public void setItemHighPrice(int itemHighPrice) {
        this.itemHighPrice = itemHighPrice;
    }

    public String getItemHighPriceTime() {
        return itemHighPriceTime;
    }

    public void setItemHighPriceTime(String itemHighPriceTime) {
        this.itemHighPriceTime = itemHighPriceTime;
    }

    public int getItemLowPrice() {
        return itemLowPrice;
    }

    public void setItemLowPrice(int itemLowPrice) {
        this.itemLowPrice = itemLowPrice;
    }

    public String getItemLowPriceTime() {
        return itemLowPriceTime;
    }

    public void setItemLowPriceTime(String itemLowPriceTime) {
        this.itemLowPriceTime = itemLowPriceTime;
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
}
