package containers;

public class ProductContainerRecorder extends ProductContainer {
	private ContainerHistory container;

	public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
		super(productName, capacity);
		this.container = new ContainerHistory();
		addToTheContainer(initialVolume);
	}

	public String history() {
		return container.toString();
	}

	@Override
	public void addToTheContainer(double amount) {
		super.addToTheContainer(amount);
		this.container.add(getVolume());
	}

	@Override
	public double takeFromTheContainer(double amount) {
		double taken = super.takeFromTheContainer(amount);
		this.container.add(getVolume());
		return taken;
		
	}

	public void printAnalysis() {
		System.out.println("Product: " + getName());
		System.out.println("History: " + history());
		System.out.println("Greatest product amount: " + this.container.maxValue());
		System.out.println("Smallest product amount: " + this.container.minValue());
		System.out.println("Average: " +  this.container.average());
		System.out.println("Greatest change: " + this.container.greatestFluctuation());
		System.out.println("Variance: " + this.container.variance());
	}
}
