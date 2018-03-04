import java.util.Scanner;

public class KTU02_07 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Iveskite uzduoties varianta: ");
		int var = reader.nextInt();
		System.out.print("Iveskite a reiksme: ");
		int a = reader.nextInt();
		System.out.print("Iveskite b reiksme: ");
		int b = reader.nextInt();
		reader.close();

		switch (var) {
		case 1:
			System.out.println("x = " + (a * b + 3));
			break;
		case 2:
			System.out.println("x = " + (a + b));
			break;
		case 3:
			System.out.println("x = " + (a - b));

		}
	}

}
