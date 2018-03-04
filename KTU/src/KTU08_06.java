import java.util.Scanner;

public class KTU08_06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Telefono pradine kaina: ");
		double k = reader.nextDouble();
		System.out.print("Menesine palukanu norma: ");
		double n = reader.nextDouble();
		System.out.print("Issimokejimo laikotarpis men: ");
		int l = reader.nextInt();
		System.out.print("Sutarties mokestis: ");
		double m = reader.nextDouble();
		reader.close();
		double pabrangimasProc = pabrangimasProc(k, n, l, m);
		System.out.printf("Telefonas pabrangs %.1f proc.", pabrangimasProc);
	}
		
		public static double pabrangimasEur(double k, double n, int l, double m) {
			double palukanos = 0;
			double kaina = k;
			for (int i =1; i<= l; i++) {
				palukanos = palukanos + kaina*n/100;
				kaina=kaina-k/l;
			}
			double pabrangimas = palukanos + m;
			return pabrangimas;
		}
		
		public static double pabrangimasProc (double k, double n, int l, double m) {
			double pabrangimas  = pabrangimasEur(k, n, l, m);
			double pabrangimasProc = (pabrangimas+k)*100/k-100;
			return pabrangimasProc;
		}
	
	}


