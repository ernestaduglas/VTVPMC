import java.util.Comparator;
public class Comparator2 implements Comparator<Dog>{
	
	
	@Override
	public int compare(Dog d1, Dog d2) {
		if(d1.getVeisle().compareTo(d2.getVeisle())==0) {
			return d1.getAge()-d2.getAge();
		}else {
			return d1.getVeisle().compareTo(d2.getVeisle());
			
		}
	}

}
