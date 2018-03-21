package lt.vtvpmc.ernestaduglas.trains.model;

import javax.persistence.Entity;

@Entity
public class CargoVagon extends Vagon {
	private double maxWeight;

	public CargoVagon() {
		super();
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	

}
