import java.util.Scanner;

public class KTU08_07 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Viso asmenu: ");
		int n = reader.nextInt();
		System.out.print("Mokiniu sk.: ");
		int a = reader.nextInt();
		System.out.print("Mokytoju sk.: ");
		int b = reader.nextInt();
		System.out.print("Kaina x: ");
		double x = reader.nextDouble();
		System.out.print("Kaina y: ");
		double y = reader.nextDouble();
		System.out.print("Kaina z: ");
		double z = reader.nextDouble();
		reader.close();
		double kainaN = kelionesKaina(n, x, y, z);
		double kainaA = kelionesKaina(a, x, y, z);
		double kainaB = kelionesKaina(b, x, y, z);
		double kainaN4 = kelionesKaina((n + 4), x, y, z);
		double kainaAsm = kainaN4 / n;
		System.out.printf("%.2f %.2f %.2f \n", kainaN, kainaA, kainaB);
		System.out.printf("%.2f \n", kainaN4);
		System.out.printf("%.2f", kainaAsm);

	}

	public static double kelionesKaina(int n, double x, double y, double z) {
		double kaina;
		if (n < 10) {
			kaina = x*n;
		} else if (n < 20) {
			kaina = y*n;
		} else {
			kaina = z*n;
		}
		return kaina;

	}

}
