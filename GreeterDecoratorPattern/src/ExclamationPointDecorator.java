
public class ExclamationPointDecorator implements Greeter {
	private Greeter greeter;
	
	public ExclamationPointDecorator(Greeter greeter) {
		this.greeter = greeter;
	}

	@Override
	public String greet(String name, String surname) {
		return greeter.greet(name, surname) + "!";
	}

}
