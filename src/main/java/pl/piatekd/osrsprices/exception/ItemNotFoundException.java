package pl.piatekd.osrsprices.exception;

public class ItemNotFoundException extends RuntimeException{
	
	public ItemNotFoundException() {
		super("No such item found.");
	}
	
	public ItemNotFoundException(String message) {
		super(message);
	}

}
