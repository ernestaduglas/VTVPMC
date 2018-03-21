package lt.vtvpmc.ernestaduglas.trains.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class PassengerVagon extends Vagon {
	@Enumerated(EnumType.STRING)
	private PassengerClass passangerClass;

	public PassengerVagon() {
		super();
	}

	public PassengerClass getPassangerClass() {
		return passangerClass;
	}

	public void setPassangerClass(PassengerClass passangerClass) {
		this.passangerClass = passangerClass;
	}

}
