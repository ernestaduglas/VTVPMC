import java.util.Scanner;

public class KTU02_08 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Iveskite pirma skaiciu: ");
		int a = reader.nextInt();
		System.out.print("Iveskite antra skaiciu: ");
		int b = reader.nextInt();
		System.out.print("Iveskite trecia skaiciu: ");
		int c = reader.nextInt();
		reader.close();

		if (a % 3 == 0) {
			System.out.println(a);
		} else {
			if (a % 3 > 0 && b % 3 == 0) {
				System.out.println(b);
			} else {
				if (a % 3 > 0 && b % 3 > 0 && c % 3 == 0) {
					System.out.println(c);
				} else {
					System.out.println("nera");
				}
			}

		}
	}

}
