package pl.piatekd.osrsprices.model;

public class ResponseObject {

	private Long id;
	private String name;
	private int high;
	private String highTime;
	private int low;
	private String lowTime;
	
	private int profit;

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

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public String getHighTime() {
		return highTime;
	}

	public void setHighTime(long highTime) {
		this.highTime = timestampToDate(highTime);
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public String getLowTime() {
		return lowTime;
	}

	public void setLowTime(long lowTime) {
		this.lowTime = timestampToDate(lowTime);
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public ResponseObject() {

	}

	public ResponseObject(int high, long highTime, int low, long lowTime) {
		this.high = high;
		this.highTime = timestampToDate(highTime);
		this.low = low;
		this.lowTime = timestampToDate(lowTime);
	}
	
	public String timestampToDate(long timestamp) {
		return new java.text.SimpleDateFormat("HH:mm:ss dd/MM/yyyy ").format(new java.util.Date (timestamp*1000));
	}

}
