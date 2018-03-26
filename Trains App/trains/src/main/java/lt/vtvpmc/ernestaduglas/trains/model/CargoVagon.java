package lt.vtvpmc.ernestaduglas.trains.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cargo")
public class CargoVagon extends Vagon {
	private double maxWeight;

	public CargoVagon() {
		
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	

}
