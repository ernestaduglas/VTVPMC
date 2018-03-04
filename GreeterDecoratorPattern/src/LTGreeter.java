
public class LTGreeter implements Greeter {
	public LTGreeter() {
		
	}

	@Override
	public String greet(String name, String surname) {
		return "Sveiki, " + name + " " + surname;
	}

}
