package pl.piatekd.osrsprices.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Data {
	
	private List<Map<String, String>> objects = new ArrayList<Map<String, String>>();

    @JsonAnySetter
    public void setDynamicProperty(String name, Map<String, String> map) {
    	objects.add(map);
    }

    public List<Map<String, String>> getObject() {
        return objects;
    }

    public void setObject(List<Map<String, String>> objects) {
        this.objects = objects;
    }

}
