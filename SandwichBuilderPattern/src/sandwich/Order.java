package sandwich;

public class Order {

	public static void main(String[] args) {
		//Builder parmaSandwich = new Builder("white bread");
		MySandwich parmaSandwich = new MySandwich.Builder("white bread").ham("Parma").cheese("Gouda").build();
		System.out.println(parmaSandwich);

	}

}
