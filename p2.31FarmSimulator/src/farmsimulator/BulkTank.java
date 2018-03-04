package farmsimulator;

public class BulkTank {
	private double capacity;
	private double volume;

	public BulkTank() {
		this.capacity = 2000.0;
		this.volume = 0;

	}

	public BulkTank(double capacity) {
		this.capacity = capacity;
		this.volume = 0;
	}

	public double getCapacity() {
		return this.capacity;
	}

	public double getVolume() {
		return this.volume;
	}

	public double howMuchFreeSpace() {
		return this.capacity - this.volume;
	}

	public void addToTank(double amount) {
		if (amount <= howMuchFreeSpace()) {
			this.volume += amount;
		} else {
			this.volume = getCapacity();
		}
	}

	public double getFromTank(double amount) {
		if (amount <= this.volume) {
			this.volume-=amount;
			return amount;
		} else {
			double all = this.volume;
			this.volume = 0;
			return all;
		}
	}

	public String toString() {
		return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
	}

}
