package pl.piatekd.osrsprices.model;

public class ResponseObject {
	
	private int id;
	private int high;
	private long highTime;
	private int low;
	private long lowTime;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public long getHighTime() {
		return highTime;
	}
	public void setHighTime(long highTime) {
		this.highTime = highTime;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public long getLowTime() {
		return lowTime;
	}
	public void setLowTime(long lowTime) {
		this.lowTime = lowTime;
	}
	
	public ResponseObject() {
		
	}
	public ResponseObject(int id, int high, long highTime, int low, long lowTime) {
		this.id = id;
		this.high = high;
		this.highTime = highTime;
		this.low = low;
		this.lowTime = lowTime;
	}
	
}
