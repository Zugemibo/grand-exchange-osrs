package pl.piatekd.osrsprices.dto;

public class AlchItemDTO {

    private String name;
    private int itemHighPrice;
    private String itemHighPriceTime;
    private int itemLowPrice;
    private String itemLowPriceTime;
    private int highAlchValue;
    private int profit;
    private int geLimit;


    public AlchItemDTO() {
    }

    public AlchItemDTO(String name, int itemHighPrice, String itemHighPriceTime, int itemLowPrice, String itemLowPriceTime, int highAlchValue, int profit, int geLimit) {
        this.name = name;
        this.itemHighPrice = itemHighPrice;
        this.itemHighPriceTime = itemHighPriceTime;
        this.itemLowPrice = itemLowPrice;
        this.itemLowPriceTime = itemLowPriceTime;
        this.highAlchValue = highAlchValue;
        this.profit = profit;
        this.geLimit = geLimit;
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

    public int getHighAlchValue() {
        return highAlchValue;
    }

    public void setHighAlchValue(int highAlchValue) {
        this.highAlchValue = highAlchValue;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getGeLimit() {
        return geLimit;
    }

    public void setGeLimit(int geLimit) {
        this.geLimit = geLimit;
    }
}
