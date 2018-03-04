package farmsimulator;

import java.util.Collection;
import java.util.LinkedList;

public class Farm implements Alive {
	private String owner;
	private CowHouse barn;
	private Collection<Cow> cows;

	public Farm(String owner, CowHouse barn) {
		this.owner = owner;
		this.barn = barn;
		this.cows = new LinkedList<Cow>();
	}

	public String getOwner() {
		return this.owner;
	}

	public BulkTank getBulkTank() {
		return this.barn.getBulkTank();
	}

	public void installMilkingRobot(MilkingRobot robot) {
		this.barn.installMilkingRobot(robot);
	}

	public void addCow(Cow cow) {
		this.cows.add(cow);
	}

	public void manageCows() {
		this.barn.takeCareOf(cows);
	}

	@Override
	public void liveHour() {
		for (Cow cow : cows) {
			cow.liveHour();
		}
	}

	public String toString() {
		if(this.cows.size()==0) {
			return "Farm owner: " + getOwner() + "\n Barn bulk tank: " 
					+ getBulkTank() + "\n No cows.";
		}else {
			return "Farm owner: " + getOwner() + "\n Barn bulk tank: " 
	+ getBulkTank() + "\n Aminals: " + cows.toString();
						
			}
	}
}

