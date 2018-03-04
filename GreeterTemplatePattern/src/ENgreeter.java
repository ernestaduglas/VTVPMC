
public class ENgreeter extends Greeter {
	private String ending = ".";

	
	public ENgreeter() {
		
	}

	@Override
	protected String getGreetingString() {
		return "Hello";
	}
	
	@Override
	protected String getEnding() {
		return ending;
	}
	
	@Override
	protected void setEnding(String ending) {
		this.ending = ending;
	}
}
