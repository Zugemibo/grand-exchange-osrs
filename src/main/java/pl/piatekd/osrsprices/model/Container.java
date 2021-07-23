package pl.piatekd.osrsprices.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Container {
	
	@JsonProperty("data")
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
