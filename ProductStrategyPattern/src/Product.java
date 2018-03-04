
public class Product {
	private VATstrategy vatStrategy;
	private double price;
	
	public Product(double price, VATstrategy vatStrategy) {
		this.price = price;
		this.vatStrategy = vatStrategy;	
	}
	public void setVATstrategy(VATstrategy vatStrategy) {
		this.vatStrategy = vatStrategy;
		
	}
	public double getPriceWithVAT() {
		return price*(1+vatStrategy.getVAT()/100);
		
	}

}
