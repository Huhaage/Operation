
import java.util.Scanner;
import java.util.Arrays;


public class DeuxMax {
	public static void main(String[] args) {
		int [] liste = {42, 12, -45, 13, 9, -12};
		Arrays.sort(liste);
		System.out.println(liste[liste.length - 1] + liste[liste.length - 2]);
	}
	public static void fonction (int[] tab) {
		int tmp = 0;
		int j = 0;
		for (int i = 0 ; i < tab.length ; i++) {
			for ( ; j < (tab.length - 1) ; j++) {
				if (tab[j - 1] < tab[j]) {
					tmp = tab[j - 1];
					tab[j] = tab[j - 1];
					tab[j - 1] = tmp;
				}
			}
		}
	}
}