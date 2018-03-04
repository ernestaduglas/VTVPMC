import java.util.Scanner;

public class KTU08_03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("A virsunes koordinate x: ");
		double xA = reader.nextDouble();
		System.out.print("A virsunes koordinate y: ");
		double yA = reader.nextDouble();
		System.out.print("B virsunes koordinate x: ");
		double xB = reader.nextDouble();
		System.out.print("B virsunes koordinate y: ");
		double yB = reader.nextDouble();
		System.out.print("C virsunes koordinate x: ");
		double xC = reader.nextDouble();
		System.out.print("C virsunes koordinate y: ");
		double yC = reader.nextDouble();
		reader.close();
		double s = trikampioPlotas(xA, yA, xB, yB, xC, yC);
		System.out.printf("Trikampio plotas = %.2f",s);
		
	}

	public static double krastinesIlgis(double xA, double yA, double xB, double yB) {
		double ab = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
		return ab;

	}

	public static double trikampioPlotas(double xA, double yA, double xB, double yB, double xC, double yC) {
		double ab = krastinesIlgis(xA, yA, xB, yB);
		double ac = krastinesIlgis(xA, yA, xC, yC);
		double bc = krastinesIlgis(xB, yB, xC, yC);
		double puseP = (ab + ac + bc) / 2;
		double s = Math.sqrt(puseP * (puseP - ab) * (puseP - ac) * (puseP - bc));
		return s;
	}
}
