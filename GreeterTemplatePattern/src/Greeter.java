
public abstract class Greeter {

	
	public final String greet(String name, String surname) {
		return getGreetingString() + ", " + name + " " + surname + getEnding();
	}
	
	protected abstract String getGreetingString();
	
	protected abstract String getEnding();
	
	protected abstract void setEnding(String ending);

}
