import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		SortedSet<Dog> manyDogs = new TreeSet<Dog>(new Comparator2());
		Dog kolis = new Dog("kolis", "mantas", 4);
		Dog aviganis = new Dog("aviganis", "tomas", 1);
		Dog taksas = new Dog("taksas", "darius", 7);
		Dog aviganis2 = new Dog("aviganis", "petras", 2);
		
		manyDogs.add(kolis);
		manyDogs.add(aviganis);
		manyDogs.add(taksas);
		manyDogs.add(aviganis2);
	
		
		System.out.println(manyDogs);
		

	}

}
