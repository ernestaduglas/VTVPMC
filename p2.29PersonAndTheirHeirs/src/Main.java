
import people.*;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // test your code here
    	List<Person> people = new ArrayList<Person>();
    	people.add(new Teacher( "Egle Lapaite", "Virsuliskiu 2, Vilnius", 1200) );
    	people.add(new Student("Juozas Lasas", "Paribio 6, Siauliai"));
    	
    	printDepartment(people);
    	
    	
    }
    	
    	public static void printDepartment(List<Person> people) {
    		for(Person element: people) {
    			System.out.println(element);
    		}
  
    		
    	}
    	
    	
//    	Teacher egle = new Teacher( "Egle Lapaite", "Virsuliskiu 2, Vilnius", 1200);
//    	Teacher darius = new Teacher("Darius Jucius", "Zemynos 4A, Siauliai", 1500);
//    	
//    	System.out.println(egle);
//    	System.out.println(darius);
//    	
//    	Student juozas = new Student("Juozas Lasas", "Paribio 6, Siauliai");
//    	
//    	for(int i=0; i<25; i++) {
//    		juozas.study();
//    	}
//    	System.out.println(juozas);
    	
    }
