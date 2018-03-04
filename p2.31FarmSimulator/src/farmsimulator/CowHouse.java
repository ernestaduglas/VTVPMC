package farmsimulator;

import java.util.Collection;

public class CowHouse {
	private BulkTank tank;
	private MilkingRobot milkingRobot;

	public CowHouse(BulkTank tank) {
		this.tank = tank;

	}

	public BulkTank getBulkTank() {
		return this.tank;
	}

	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.milkingRobot = milkingRobot;
		this.milkingRobot.setBulkTank(this.tank);
	}

	public void takeCareOf(Cow cows) {
		if (this.milkingRobot == null) {
			throw new IllegalStateException("The MilkingRobot hasn't been installed");
		} else {
			this.milkingRobot.milk(cows);
		}
	}

	public void takeCareOf(Collection<Cow> cows) {
		if (this.milkingRobot == null) {
			throw new IllegalStateException("The MilkingRobot hasn't been installed");
		} else {
			for (Cow cow : cows) {
				this.milkingRobot.milk(cow);
			}
		}
	}

	public String toString() {
		return this.tank.toString();
	}

}
