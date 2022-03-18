
import java.util.Scanner;


public class Operation2variable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veillez choissir l'operation que vous voulez efectuer");
		System.out.println("ecrivez + pour une opération");
		System.out.println("ecrivez - pour une soustraction");
		System.out.println("ecrivez * pour une multiplication");
		System.out.println("ecrivez / pour une divition");
		String choix = scan.next();
		System.out.println("pour x " + choix + " y");
		System.out.println("veillez saisir x");
		double x = scan.nextInt();
		System.out.println("veillez saisir y");
		double y = scan.nextInt();
		if (choix.equals("+")) {
			System.out.println(add(x,y));
		}
		else if (choix.equals("-")) {
			System.out.println(sub(x,y));
		}
		else if (choix.equals("*")) {
			System.out.println(mul(x,y));
		}
		else if (choix.equals("/")) {
			if (y != 0) {
				System.out.println(div(x,y));
			}
			else {
				System.out.println("On ne peut pas diviser par 0");
			}
		}
	}
	public static double add (double x, double y) {
		return x + y;
	}
	private static double sub(double x, double y) {
		return x - y;
	}
	public static double mul (double x, double y) {
		return x * y;
	}
	public static double div (double x, double y) {
		return x / y;
	}
	// pour le 6)2 tu fait soit un tableaux soit tu utilise de syso sussif en jouant sur les espace
}