import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
	private Map<String, Record> book;

	public PhoneBook() {
		this.book = new HashMap<String, Record>();
	}

	public void addRecord(String name, String number) {
		if (this.book.containsKey(name)) {
			this.book.get(name).addNumber(number);
		} else {
			Record newRecord = new Record(name, number);
			this.book.put(name, newRecord);
		}
	}

	public void searchRecordByName(String name) {
		if (!this.book.containsKey(name)) {
			System.out.println("not found");
		} else {
			System.out.println(this.book.get(name).getNumber());
		}
	}

	public void searchRecordByNumber(String number) {
		for (Map.Entry<String, Record> element : this.book.entrySet()) {
			if (element.getValue().searchNumberInSet(number)) {
				System.out.println(element.getKey());
			} else {
				System.out.println("not found");
			}
		}
	}

	public void addAddress(String name, String address) {
		if (this.book.containsKey(name)) {
			this.book.get(name).addAddress(address);
		} else {
			Record newRecord = new Record(name);
			newRecord.addAddress(address);
			this.book.put(name, newRecord);
		}
	}

	public String searchInformation(String name) {
		if (!this.book.containsKey(name)) {
			return "not found";
		} else {
			if (this.book.get(name).getAddress() == null) {
				return "address unknown \nphone numbers: " + this.book.get(name).getNumber();
			} else if (this.book.get(name).getNumber().isEmpty()) {
				return "address: " + this.book.get(name).getAddress() + "\nphone number not found";
			} else {
				return "address: " + this.book.get(name).getAddress() + "\nphone numbers: "
						+ this.book.get(name).getNumber();
			}
		}
	}

	public void deleteRecord(String name) {
		this.book.remove(name);
	}

	public void searchByKeyword(String keyword) {
		List<String> search = new ArrayList<String>();

		for (Map.Entry<String, Record> element : this.book.entrySet()) {
			if (element.getValue().searchNameByKeyword(keyword)) {
				search.add(element.getKey() + searchInformation(element.getKey()));
			} else if (element.getValue().searchAddessByKeyword(keyword)) {
				search.add(element.getKey() + searchInformation(element.getKey()));
			}
		}

		if (search.size() == 0) {
			System.out.println("keyword not found");
		} else {
			Collections.sort(search);
			for (String element : search) {
				System.out.println(element);
			}

		}
	}

}
