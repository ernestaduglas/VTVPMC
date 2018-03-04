import java.util.Set;
import java.util.TreeSet;

public class Record{
	private Set<String> numbers;
	private String name;
	private String address;

	public Record(String name, String number) {
		this.numbers = new TreeSet<String>();
		this.numbers.add(number);
		this.name = name;
	}

	public Record(String name) {
		this.numbers = new TreeSet<String>();
		this.name = name;
	}

	public void addNumber(String number) {
		this.numbers.add(number);

	}

	public void addAddress(String address) {
		this.address = address;
	}

	public Set<String> getNumber() {
		return this.numbers;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public boolean searchNumberInSet(String number) {
		if (this.numbers.contains(number)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean searchNameByKeyword(String keyword) {
		if (this.name.contains(keyword)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean searchAddessByKeyword(String keyword) {
		if (this.address==null) {
			return false;
		}
		if (this.address.contains(keyword)) {
			return true;
		} else {
			return false;
		}
	}
}

