package lt.vtvpmc.ernestaduglas.trains.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("passenger")
public class PassengerVagon extends Vagon {
	@Enumerated(EnumType.STRING)
	private PassengerClass passangerClass;

	public PassengerVagon() {
		
	}

	public PassengerClass getPassangerClass() {
		return passangerClass;
	}

	public void setPassangerClass(PassengerClass passangerClass) {
		this.passangerClass = passangerClass;
	}

}
