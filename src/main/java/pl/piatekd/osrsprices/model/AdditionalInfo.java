package pl.piatekd.osrsprices.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdditionalInfo {

    @Id
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("members")
    private boolean members;
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
    @JsonProperty("cost")
    private int cost;
    @JsonProperty("low_alch")
    private int lowAlch;
    @JsonProperty("high_alch")
    private int highAlch;
    @JsonProperty("trade_limit")
    private int tradeLimit;


    public AdditionalInfo() {
    }

    public AdditionalInfo(Long id, String name, boolean members, boolean tradeableOnGe, boolean stackable, boolean noted, boolean noteable, boolean equipable, int cost, int lowAlch, int highAlch) {
        this.id = id;
        this.name = name;
        this.members = members;
        this.tradeableOnGe = tradeableOnGe;
        this.stackable = stackable;
        this.noted = noted;
        this.noteable = noteable;
        this.equipable = equipable;
        this.cost = cost;
        this.lowAlch = lowAlch;
        this.highAlch = highAlch;
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

    public boolean isMembers() {
        return members;
    }

    public void setMembers(boolean members) {
        this.members = members;
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

    @Override
    public String toString() {
        return "AdditionalInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", members=" + members +
                ", tradeableOnGe=" + tradeableOnGe +
                ", stackable=" + stackable +
                ", noted=" + noted +
                ", noteable=" + noteable +
                ", equipable=" + equipable +
                ", cost=" + cost +
                ", lowAlch=" + lowAlch +
                ", highAlch=" + highAlch +
                '}';
    }
}
