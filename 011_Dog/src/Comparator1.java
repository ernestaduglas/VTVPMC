import java.util.Comparator;
public class Comparator1 implements Comparator<Dog> {

	
	@Override
	public int compare(Dog d1, Dog d2) {
		return d2.getAge()-d1.getAge();
		
	}

}
