
public class UpperCaseDecorator implements Greeter {
	private Greeter greeter;
	
	public UpperCaseDecorator(Greeter greeter) {
		this.greeter = greeter;
	}

	@Override
	public String greet(String name, String surname) {
		return greeter.greet(name, surname).toUpperCase();
	}

}
