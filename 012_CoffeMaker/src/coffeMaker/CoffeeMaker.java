package coffeMaker;
import java.util.Scanner;

import exceptions.CoffeeMakerLacksRawMaterial;
import exceptions.CoffeeMakerNotClean;
import exceptions.CoffeeMakerNotWorking;
import exceptions.InvalidInput;

public class CoffeeMaker {
	private int water;
	private int beans;
	private int milk;
	private boolean state;
	private int countCappuccino;
	Scanner reader;

	public CoffeeMaker() {
		this.state = false;
	}

	public void on() {
		this.state = true;
		this.water = 0;
		this.beans = 0;
		this.milk = 0;
		reader = new Scanner(System.in);

	}

	public void off() {
		this.state = false;
		System.out.println("Goodbye!");
	}

	public boolean isOn() {
		return this.state;
	}

	public int getWater() {
		return this.water;
	}

	public int getBeans() {
		return this.beans;
	}

	public int getMilk() {
		return this.milk;
	}

	public void addWater(int water) throws InvalidInput {
		if (water > (15 - getWater())) {
			throw new InvalidInput("Water tank capacity is 15 cups.");
		} else {
			this.water = water;
		}
	}

	public void addBeans(int beans) throws InvalidInput {
		if (beans > (5 - getBeans())) {
			throw new InvalidInput("Coffee beans tank capacity is 5 cups.");
		} else {
			this.beans = beans;
		}
	}

	public void addMilk(int milk) throws InvalidInput {
		if (milk > (10 - getMilk())) {
			throw new InvalidInput("Milk tank capacity is 10 cups.");
		} else {
			this.milk = milk;
		}
	}

	public void makeEspresso() throws CoffeeMakerNotWorking {
		if (isOn() == false) {
			throw new CoffeeMakerNotWorking("Coffee Maker is turned off. Turn on to make coffee.");
		} else if (this.water < 1) {
			throw new CoffeeMakerLacksRawMaterial("There is no water. Add water to make coffee.");
		} else if (this.beans < 1) {
			throw new CoffeeMakerLacksRawMaterial("There is no coffee beans. Add coffee beans to make coffee.");
		} else {
			this.beans--;
			this.water--;
			System.out.println("Take your coffee!");
		}
	}

	public void makeCappuccino() throws CoffeeMakerNotWorking, CoffeeMakerNotClean {
		if (isOn() == false) {
			throw new CoffeeMakerNotWorking("Coffee Maker is turned off. Turn on to make coffee.");
		}
		if (this.countCappuccino >= 7) {
			throw new CoffeeMakerNotClean();
		}
		if (this.water < 1) {
			throw new CoffeeMakerLacksRawMaterial("There is no water. Add water to make coffee.");
		}
		if (this.beans < 1) {
			throw new CoffeeMakerLacksRawMaterial("There is no coffee beans. Add coffee beans to make coffee.");
		}
		if (this.milk < 1) {
			throw new CoffeeMakerLacksRawMaterial("There is no milk. Add milk to make coffee.");
		}
		this.beans--;
		this.water--;
		this.milk--;
		this.countCappuccino++;
		System.out.println("Take your coffee!");
	}

	public void clean() {
		this.countCappuccino = 0;
		System.out.println("Coffee Maker cleaned!");
	}

	public void menu() {
		System.out.println("\n0-Exit; " + "\n1-Make Expresso; " + "\n2-Make Cappuccino; " + "\n3-Add water; "
				+ "\n4-Add coffe beans;" + "\n5-Add milk;" + "\n6-Clean;");

		while (true) {
			System.out.println("");
			System.out.print("Select action: ");
			int action = reader.nextInt();
			switch (action) {
			case 0:
				this.off();
				return;
			case 1:
				try {
					this.makeEspresso();
				} catch (CoffeeMakerNotWorking e) {
					System.err.println(e);
				}
				break;
			case 2:
				try {
					this.makeCappuccino();
				} catch (CoffeeMakerNotClean e) {
					System.err.println(e);
				} catch (CoffeeMakerNotWorking f) {
					System.err.println(f);
				}
				break;
			case 3:
				System.out.print("How many cups: ");
				int amount = Integer.parseInt(reader.next());
				try {
					this.addWater(amount);
				} catch (InvalidInput e) {
					System.err.println(e);
				} finally {
					System.out.println("Water tank now contains: " + this.getWater() + " cups.");
				}
				break;
			case 4:
				System.out.print("How many cups: ");
				amount = Integer.parseInt(reader.next());
				try {
					this.addBeans(amount);
				} catch (InvalidInput e) {
					System.err.println(e);
				} finally {
					System.out.println("Coffee beans tank now contains: " + this.getBeans() + " cups.");
				}
				break;
			case 5:
				System.out.print("How many cups: ");
				amount = Integer.parseInt(reader.next());
				try {
					this.addMilk(amount);
				} catch (InvalidInput e) {
					System.err.println(e);
				} finally {
					System.out.println("Milk tank now contains: " + this.getMilk() + " cups.");
				}
				break;
			case 6:
				this.clean();
				break;
			}
		}

	}
}
