
public class LTgreeter extends Greeter {
	private String ending = ".";
	
	public LTgreeter() {
	}

	@Override
	protected String getGreetingString() {
		return "Sveiki";
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
