
public class ENGreeter implements Greeter {
	public ENGreeter() {
		
	}

	@Override
	public String greet(String name, String surname) {
		return "Hello, " + name + " " + surname;
	}

}
