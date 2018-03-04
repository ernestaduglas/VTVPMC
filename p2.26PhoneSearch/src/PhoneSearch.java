import java.util.Scanner;

public class PhoneSearch {
	private Scanner reader;
	private PhoneBook book;

	public PhoneSearch() {
		this.reader = new Scanner(System.in);
		this.book = new PhoneBook();
	}

	public void start() {
		System.out.println("available operations: " + "\n1 add a number " + "\n2 search for a number "
				+ "\n3 search for a person by phone number " + "\n4 add an address "
				+ "\n5 search for personal information " + "\n6 delete personal information " + "\n7 filtered listing "
				+ "\nx quit");
		while (true) {
			System.out.print("command: ");
			String command = reader.nextLine();
			switch (command) {
			case "1":
				System.out.print("whose number: ");
				String name = reader.nextLine();
				System.out.print("number: ");
				String number = reader.nextLine();
				this.book.addRecord(name, number);
				break;
			case "2":
				System.out.print("whose number: ");
				name = reader.nextLine();
				this.book.searchRecordByName(name);
				break;
			case "3":
				System.out.print("number: ");
				number = reader.nextLine();
				this.book.searchRecordByNumber(number);
				break;
			case "4":
				System.out.print("whose address: ");
				name = reader.nextLine();
				System.out.print("street: ");
				String street = reader.nextLine();
				System.out.print("city: ");
				String city = reader.nextLine();
				String address = street + " " + city;
				this.book.addAddress(name, address);
				break;
			case "5":
				System.out.print("whose information: ");
				name = reader.nextLine();
				System.out.println(this.book.searchInformation(name));
				break;
			case "6":
				System.out.print("whose information: ");
				name = reader.nextLine();
				this.book.deleteRecord(name);
				break;
			case "7":
				System.out.print("keyword (if empty, all listed): ");
				String keyword = reader.nextLine();
				this.book.searchByKeyword(keyword);
				break;
			case "x":
				return;
			default:
				System.out.println("Invalid command");
				break;
			}
		}
	}
}
