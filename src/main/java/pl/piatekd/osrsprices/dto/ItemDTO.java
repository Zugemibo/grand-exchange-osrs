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
    private Object tradeLimit;
    private boolean members;
    private Object dailyTraded;

    public ItemDTO() {
    }

    public ItemDTO(String name, int itemHighPrice, int itemHighPriceTime, int itemLowPrice, int itemLowPriceTime, long margin, double percentageMargin, Integer tradeLimit, boolean members, Long dailyTraded) {
        this.name = name;
        this.itemHighPrice = itemHighPrice;
        this.itemHighPriceTime = TimeConverter.timestampToDate(itemHighPriceTime);
        this.itemLowPrice = itemLowPrice;
        this.itemLowPriceTime = TimeConverter.timestampToDate(itemLowPriceTime);
        this.margin = margin;
        this.percentageMargin = percentageMargin;
        this.tradeLimit = (tradeLimit != null) ? tradeLimit : "???";
        this.members = members;
        this.dailyTraded = (dailyTraded != null) ? dailyTraded : "???";
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

    public Object getTradeLimit() {
        return tradeLimit;
    }

    public boolean isMembers() {
        return members;
    }

    public void setMembers(boolean members) {
        this.members = members;
    }

    public void setTradeLimit(Object tradeLimit) {
        this.tradeLimit = tradeLimit;
    }

    public Object getDailyTraded() {
        return dailyTraded;
    }

    public void setDailyTraded(Object dailyTraded) {
        this.dailyTraded = dailyTraded;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemDTO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", itemHighPrice=").append(itemHighPrice);
        sb.append(", itemHighPriceTime='").append(itemHighPriceTime).append('\'');
        sb.append(", itemLowPrice=").append(itemLowPrice);
        sb.append(", itemLowPriceTime='").append(itemLowPriceTime).append('\'');
        sb.append(", margin=").append(margin);
        sb.append(", percentageMargin=").append(percentageMargin);
        sb.append(", tradeLimit=").append(tradeLimit);
        sb.append(", members=").append(members);
        sb.append('}');
        return sb.toString();
    }
}