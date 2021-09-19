package pl.piatekd.osrsprices.dto;

public class HighAlchItemDTO {

    private String name;
    private int itemHighPrice;
    private int itemHighPriceTime;
    private int itemLowPrice;
    private int itemLowPriceTime;
    private int highAlchValue;
    private int highAlchDifference;
    private boolean member;
    private int buyLimit;

    public HighAlchItemDTO() {
    }

    public HighAlchItemDTO(String name, int itemHighPrice, int itemHighPriceTime, int itemLowPrice, int itemLowPriceTime, int highAlchValue, int highAlchDifference, boolean member, int buyLimit) {
        this.name = name;
        this.itemHighPrice = itemHighPrice;
        this.itemHighPriceTime = itemHighPriceTime;
        this.itemLowPrice = itemLowPrice;
        this.itemLowPriceTime = itemLowPriceTime;
        this.highAlchValue = highAlchValue;
        this.highAlchDifference = highAlchDifference;
        this.member = member;
        this.buyLimit = buyLimit;
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

    public int getItemHighPriceTime() {
        return itemHighPriceTime;
    }

    public void setItemHighPriceTime(int itemHighPriceTime) {
        this.itemHighPriceTime = itemHighPriceTime;
    }

    public int getItemLowPrice() {
        return itemLowPrice;
    }

    public void setItemLowPrice(int itemLowPrice) {
        this.itemLowPrice = itemLowPrice;
    }

    public int getItemLowPriceTime() {
        return itemLowPriceTime;
    }

    public void setItemLowPriceTime(int itemLowPriceTime) {
        this.itemLowPriceTime = itemLowPriceTime;
    }

    public int getHighAlchValue() {
        return highAlchValue;
    }

    public void setHighAlchValue(int highAlchValue) {
        this.highAlchValue = highAlchValue;
    }

    public int getHighAlchDifference() {
        return highAlchDifference;
    }

    public void setHighAlchDifference(int highAlchDifference) {
        this.highAlchDifference = highAlchDifference;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public int getBuyLimit() {
        return buyLimit;
    }

    public void setBuyLimit(int buyLimit) {
        this.buyLimit = buyLimit;
    }


    @Override
    public String toString() {
        return "HighAlchItemDTO{" +
                "name='" + name + '\'' +
                ", itemHighPrice=" + itemHighPrice +
                ", itemHighPriceTime=" + itemHighPriceTime +
                ", itemLowPrice=" + itemLowPrice +
                ", itemLowPriceTime=" + itemLowPriceTime +
                ", highAlchValue=" + highAlchValue +
                ", highAlchDifference=" + highAlchDifference +
                ", member=" + member +
                ", buyLimit=" + buyLimit +
                '}';
    }
}
