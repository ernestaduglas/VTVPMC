

public class Main {

	public static void main(String[] args) {
		Greeter myGreeter;
		myGreeter = new ENgreeter();
		System.out.println(myGreeter.greet("Ernesta", "Duglas"));
		
		myGreeter = new LTgreeter();
		System.out.println(myGreeter.greet("Ernesta", "Duglas"));
		
		myGreeter.setEnding("!!!");
		System.out.println(myGreeter.greet("Ernesta", "Duglas"));
		
		myGreeter = new LTgreeterWithExclamationPoint();
		System.out.println(myGreeter.greet("Ernesta", "Duglas"));

	}

}
