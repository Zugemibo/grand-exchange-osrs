package pl.piatekd.osrsprices.model;

import java.util.List;

public class Response {
	
	private List<ResponseObject> data;
	
	public Response(List<ResponseObject> data) {
		this.data = data;
	}
	
	public Response() {
		
	}

	public List<ResponseObject> getData() {
		return data;
	}

	public void setData(List<ResponseObject> data) {
		this.data = data;
	}
	
}
