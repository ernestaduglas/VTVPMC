package lt.vtvpmc.ernestaduglas.trains.model;

import java.math.BigDecimal;

public class VagonCreate {
	private VagonType vagonType;
	private String company;
	private int count;
	private BigDecimal price;
	private double capacity;
	private PassengerClass passangerClass;
	private double maxWeight;
	private LocomotiveType type;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public PassengerClass getPassangerClass() {
		return passangerClass;
	}

	public void setPassangerClass(PassengerClass passangerClass) {
		this.passangerClass = passangerClass;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public LocomotiveType getType() {
		return type;
	}

	public void setType(LocomotiveType type) {
		this.type = type;
	}

	public VagonType getVagonType() {
		return vagonType;
	}

	public void setVagonType(VagonType vagonType) {
		this.vagonType = vagonType;
	}


	
	
	

}
