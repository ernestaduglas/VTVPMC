package farmsimulator;
//import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		// Test your program here

		MilkingRobot milkingRobot = new MilkingRobot();
		Cow cow = new Cow();
		milkingRobot.milk(cow);
	}
}

