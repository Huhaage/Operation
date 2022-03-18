
import java.util.Scanner;
import java.util.Arrays;


public class traingle {
	public static void main(String[] args) {
		String[][] triangle = {
				{" "," "," "," "," "," ","*"},
				{" "," "," "," "," ","*","*","*"},
				{" "," "," "," ","*","*","*","*","*"},
				{" "," "," ","*","*","*","*","*","*","*"},
				{" "," ","*","*","*","*","*","*","*","*","*"},
				{" ","*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*","*","*"},
		};
		for (int i = 0 ; i < triangle.length; i++) {
			for (int j = 0 ; j < triangle[i].length ; j++) {
				System.out.print(triangle[i][j]);
			}
			System.out.println();
		}
	}
}