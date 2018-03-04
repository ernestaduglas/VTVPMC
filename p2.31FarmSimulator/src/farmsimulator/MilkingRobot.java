package farmsimulator;
import java.lang.IllegalStateException;

public class MilkingRobot {
	private BulkTank tank;
	
	public MilkingRobot() {
		this.tank = null;
		
	}
	
	public BulkTank getBulkTank() {
		return this.tank;
		
	}
	
	public void setBulkTank(BulkTank tank) {
		this.tank = tank ;
	}
	
	public void milk(Milkable milkable) {
		if(this.tank==null) {
			throw new IllegalStateException("The MilkingRobot hasn't been installed");
		}else {
			double milkedAmount = milkable.milk();
		tank.addToTank(milkedAmount);
	}
	}

}
