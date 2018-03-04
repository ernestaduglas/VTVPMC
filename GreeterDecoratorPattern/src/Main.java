
public class Main {

	public static void main(String[] args) {
		Greeter myGreeter = new ENGreeter();
		myGreeter = new UpperCaseDecorator(myGreeter);
		myGreeter = new ExclamationPointDecorator(myGreeter);
		System.out.println(myGreeter.greet("Ernesta", "Duglas"));
		
		Greeter otherGreeter = new UpperCaseDecorator(new ExclamationPointDecorator(new LTGreeter()));
		System.out.println(otherGreeter.greet("Ernesta", "Duglas"));
		

	}

}
