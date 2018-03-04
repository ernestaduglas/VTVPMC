import java.util.Scanner;

public class KTU02_06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Iveskite kiek liko ziemoti pirmos rusies pauksciu: ");
		int a = reader.nextInt();
		System.out.print("Iveskite kiek liko ziemoti antros rusies pauksciu: ");
		int b = reader.nextInt();
		System.out.print("Iveskite kiek liko ziemoti trecios rusies pauksciu: ");
		int c = reader.nextInt();
		reader.close();

		// abc
		// acb
		// bac
		// bca
		// cab
		// cba

		if (a >= b && a >= c && b >= c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("Skirtumas tarp didziausio ir maziausio kiekio: " + (a - c));
		} else {
			if (a > b && a >= c && c > b) {
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
				System.out.println("Skirtumas tarp didziausio ir maziausio kiekio: " + (a - b));
			} else {
				if (b > a && a >= c && b >= c) {
					System.out.println(b);
					System.out.println(a);
					System.out.println(c);
					System.out.println("Skirtumas tarp didziausio ir maziausio kiekio: " + (b - c));
				} else {
					if (b >= c && b > a && c > a) {
						System.out.println(b);
						System.out.println(c);
						System.out.println(a);
						System.out.println("Skirtumas tarp didziausio ir maziausio kiekio: " + (b - a));
					} else {
						if (c > a && c > b && a >= c) {
							System.out.println(c);
							System.out.println(a);
							System.out.println(b);
							System.out.println("Skirtumas tarp didziausio ir maziausio kiekio: " + (c - b));
						} else {
							System.out.println(c);
							System.out.println(b);
							System.out.println(a);
							System.out.println("Skirtumas tarp didziausio ir maziausio kiekio: " + (c - a));
						}
					}
				}
			}
		}
	}
}
