
public class Main {

	public static void main(String[] args) {
		Product myProduct = new Product(3,new PolishVAT());
		System.out.println(myProduct.getPriceWithVAT());
		myProduct.setVATstrategy(new LithuanianVAT());
		System.out.println(myProduct.getPriceWithVAT());

	}

}
