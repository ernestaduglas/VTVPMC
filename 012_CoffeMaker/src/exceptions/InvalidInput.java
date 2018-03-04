package exceptions;

public class InvalidInput extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInput(String text) {
		super(text);
	}
}
