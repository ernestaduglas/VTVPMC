package lt.vtvpmc.ernestaduglas.trains.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Locomotive extends Vagon {
	@Enumerated(EnumType.STRING)
	private LocomotiveType type;

	public Locomotive() {
		super();
	}

	public LocomotiveType getType() {
		return type;
	}

	public void setType(LocomotiveType type) {
		this.type = type;
	}

}
