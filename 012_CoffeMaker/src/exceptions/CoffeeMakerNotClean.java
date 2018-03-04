package exceptions;

public class CoffeeMakerNotClean extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CoffeeMakerNotClean() {
		super("Coffee Maker must be cleaned.");
	}

}
