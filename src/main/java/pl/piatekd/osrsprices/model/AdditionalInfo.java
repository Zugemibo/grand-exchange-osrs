package pl.piatekd.osrsprices.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AdditionalInfo {

    @Id
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("members")
    private boolean members;
    @JsonProperty("tradeable")
    private boolean tradeable;
    @JsonProperty("tradeable_on_ge")
    private boolean tradeableOnGe;
    @JsonProperty("stackable")
    private boolean stackable;
    @JsonProperty("noted")
    private boolean noted;
    @JsonProperty("noteable")
    private boolean noteable;
    @JsonProperty("equipable")
    private boolean equipable;
    @JsonProperty("equipable_by_player")
    private boolean equipableByPlayer;
    @JsonProperty("equipable_weapon")
    private boolean equipableWeapon;
    @JsonProperty("cost")
    private int cost;
    @JsonProperty("lowalch")
    private int lowAlch;
    @JsonProperty("highalch")
    private int highAlch;
    @JsonProperty("weight")
    private int weight;
    @JsonProperty("buy_limit")
    private int buyLimit;
    @JsonProperty("quest_item")
    private boolean questItem;
    @JsonProperty("release_date")
    private Date releaseDate;
    @JsonProperty("duplicate")
    private boolean duplicate;
    @JsonProperty("examine")
    private String description;
    @JsonProperty("wiki_name")
    private String wikiName;
    @JsonProperty("wiki_url")
    private String wikiUrl;
    @OneToOne(mappedBy = "additionalInfo", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    @JsonManagedReference
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public AdditionalInfo(Long id, boolean members, boolean tradeable, boolean tradeableOnGe, boolean stackable, boolean noted, boolean noteable, boolean equipable, boolean equipableByPlayer, boolean equipableWeapon, int cost, int lowAlch, int highAlch, int weight, int buyLimit, boolean questItem, Date releaseDate, boolean duplicate, String description, String wikiName, String wikiUrl) {
        this.id = id;
        this.members = members;
        this.tradeable = tradeable;
        this.tradeableOnGe = tradeableOnGe;
        this.stackable = stackable;
        this.noted = noted;
        this.noteable = noteable;
        this.equipable = equipable;
        this.equipableByPlayer = equipableByPlayer;
        this.equipableWeapon = equipableWeapon;
        this.cost = cost;
        this.lowAlch = lowAlch;
        this.highAlch = highAlch;
        this.weight = weight;
        this.buyLimit = buyLimit;
        this.questItem = questItem;
        this.releaseDate = releaseDate;
        this.duplicate = duplicate;
        this.description = description;
        this.wikiName = wikiName;
        this.wikiUrl = wikiUrl;
    }

    public AdditionalInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isMembers() {
        return members;
    }

    public void setMembers(boolean members) {
        this.members = members;
    }

    public boolean isTradeable() {
        return tradeable;
    }

    public void setTradeable(boolean tradeable) {
        this.tradeable = tradeable;
    }

    public boolean isTradeableOnGe() {
        return tradeableOnGe;
    }

    public void setTradeableOnGe(boolean tradeableOnGe) {
        this.tradeableOnGe = tradeableOnGe;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public boolean isNoted() {
        return noted;
    }

    public void setNoted(boolean noted) {
        this.noted = noted;
    }

    public boolean isNoteable() {
        return noteable;
    }

    public void setNoteable(boolean noteable) {
        this.noteable = noteable;
    }

    public boolean isEquipable() {
        return equipable;
    }

    public void setEquipable(boolean equipable) {
        this.equipable = equipable;
    }

    public boolean isEquipableByPlayer() {
        return equipableByPlayer;
    }

    public void setEquipableByPlayer(boolean equipableByPlayer) {
        this.equipableByPlayer = equipableByPlayer;
    }

    public boolean isEquipableWeapon() {
        return equipableWeapon;
    }

    public void setEquipableWeapon(boolean equipableWeapon) {
        this.equipableWeapon = equipableWeapon;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLowAlch() {
        return lowAlch;
    }

    public void setLowAlch(int lowAlch) {
        this.lowAlch = lowAlch;
    }

    public int getHighAlch() {
        return highAlch;
    }

    public void setHighAlch(int highAlch) {
        this.highAlch = highAlch;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBuyLimit() {
        return buyLimit;
    }

    public void setBuyLimit(int buyLimit) {
        this.buyLimit = buyLimit;
    }

    public boolean isQuestItem() {
        return questItem;
    }

    public void setQuestItem(boolean questItem) {
        this.questItem = questItem;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isDuplicate() {
        return duplicate;
    }

    public void setDuplicate(boolean duplicate) {
        this.duplicate = duplicate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWikiName() {
        return wikiName;
    }

    public void setWikiName(String wikiName) {
        this.wikiName = wikiName;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    @Override
    public String toString() {
        return "AdditionalInfo{" +
                "id=" + id +
                ", members=" + members +
                ", tradeable=" + tradeable +
                ", tradeableOnGe=" + tradeableOnGe +
                ", stackable=" + stackable +
                ", noted=" + noted +
                ", noteable=" + noteable +
                ", equipable=" + equipable +
                ", equipableByPlayer=" + equipableByPlayer +
                ", equipableWeapon=" + equipableWeapon +
                ", cost=" + cost +
                ", lowAlch=" + lowAlch +
                ", highAlch=" + highAlch +
                ", weight=" + weight +
                ", buyLimit=" + buyLimit +
                ", questItem=" + questItem +
                ", releaseDate=" + releaseDate +
                ", duplicate=" + duplicate +
                ", description='" + description + '\'' +
                ", wikiName='" + wikiName + '\'' +
                ", wikiUrl='" + wikiUrl + '\'' +
                '}';
    }
}
