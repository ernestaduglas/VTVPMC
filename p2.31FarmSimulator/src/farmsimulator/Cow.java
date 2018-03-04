package farmsimulator;
import java.util.Random;

public class Cow implements Milkable, Alive{
	private String name;
	private double udderCapacity;
	private double availableMilk;
	private static final String[] NAMES = new String[]{
			"Anu", "Arpa", "Essi", "Heluna", "Hely",
			"Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
			"Jaana", "Jami", "Jatta", "Laku", "Liekki",
			"Mainikki", "Mella", "Mimmi", "Naatti",
			"Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
			"Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
	
	
	public Cow() {
		this.udderCapacity = 15 + new Random().nextInt(26);
		this.name = NAMES[new Random().nextInt(NAMES.length-1)];
	}
	
	public Cow(String name) {
		this.name = name;
		this.udderCapacity = 15 + new Random().nextInt(26);
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCapacity() {
		return this.udderCapacity;
	}
	
	public double getAmount() {
		return this.availableMilk;
	}
	
	public String toString() {
		return getName() + " " + Math.ceil(getAmount())+ "/" +Math.ceil(getCapacity());
	}
	@Override
	public double milk() {
		double milk = this.availableMilk;
		this.availableMilk = 0;
		return milk;
	}
	
	@Override
	public void liveHour() {
		double milkPerHour = (double)(7 + new Random().nextInt(14))/10;
		if(this.availableMilk+milkPerHour<= getCapacity()) {
			this.availableMilk+=milkPerHour;
		}else if(this.availableMilk+milkPerHour> getCapacity()) {
			this.availableMilk=getCapacity();
		}
		
		
	}

}
