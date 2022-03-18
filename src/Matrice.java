
import java.util.Scanner;
import java.util.Arrays;


public class Matrice {
	public static void main(String[] args) {
		int [][] first = {
				{5 , 2 , 4},
				{0 , 1, 1},
				{6, 3 , 1}
		};
		int [][] second = {
				{1 , 1 , 3},
				{2 , 5, 6},
				{3, 0 , 5}
		};
		int [][] thrid = {
				{8 , 7},
				{5 , 4},
				{2 , 1}
		};
		int [][] fourth = {
				{0 , 2},
				{1 , 2},
				{1 , 1}
		};
		addMat(first,second);
		System.out.println("-------------");
		addMat(first, thrid);
		System.out.println("-------------");
		subMat(thrid, fourth);
		System.out.println("-------------");
		mulMat(fourth, 2);
	}
	static void addMat (int[][]M1, int[][]M2) {
		boolean memetaille = true;
		int [][] Madd = {
				{0 , 0 , 0},
				{0 , 0 , 0},
				{0 , 0 , 0}
		};
		for (int k = 0 ; k < M1.length ; k++) {
			if (M1.length != M2.length) {
				memetaille = false;
			}
			else if (M1[k].length != M2[k].length) {
				memetaille = false;
			}
		}
		if (memetaille == true) {
			for (int i = 0 ; i < M1.length ; i++) {
				for (int j = 0 ; j < M1[i].length ; j++ ) {
					System.out.print(M1[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println("+");
			for (int i = 0 ; i < M1.length ; i++) {
				for (int j = 0 ; j < M2[i].length ; j++ ) {
					System.out.print(M2[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}	
			System.out.println("=");
			for (int i = 0 ; i < M1.length ; i++) {
				for (int j = 0 ; j < M2[i].length ; j++ ) {
					System.out.print(Madd[i][j] = M1[i][j] + M2[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("pour les aditionner les matruce doive etre de meme dimention");
		}
	}
		//6)5
	static void subMat (int[][]M1, int[][]M2) {
		boolean memetaille = true;
		int [][] Msub = {
				{0 , 0 , 0},
				{0 , 0 , 0},
				{0 , 0 , 0}
		};
		for (int k = 0 ; k < M1.length ; k++) {
			if (M1.length != M2.length) {
				memetaille = false;
			}
			else if (M1[k].length != M2[k].length) {
				memetaille = false;
			}
		}
		if (memetaille == true) {
			for (int i = 0 ; i < M1.length ; i++) {
				for (int j = 0 ; j < M1[i].length ; j++ ) {
					System.out.print(M1[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println("-");
			for (int i = 0 ; i < M1.length ; i++) {
				for (int j = 0 ; j < M2[i].length ; j++ ) {
					System.out.print(M2[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}	
			System.out.println("=");
			for (int i = 0 ; i < M1.length ; i++) {
				for (int j = 0 ; j < M2[i].length ; j++ ) {
					System.out.print(Msub[i][j] = M1[i][j] - M2[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	static void mulMat (int[][]M1, int M2) {
		int [][] Msub = {
				{0 , 0 , 0},
				{0 , 0 , 0},
				{0 , 0 , 0}
		};
		System.out.println(M2);
		for (int i = 0 ; i < M1.length ; i++) {
			for (int j = 0 ; j < M1[i].length ; j++ ) {
				System.out.print(M1[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("*");
		for (int i = 0 ; i < M1.length ; i++) {
			for (int j = 0 ; j < M1[i].length ; j++ ) {
				System.out.print(M1[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}	
		System.out.println("=");
		for (int i = 0 ; i < M1.length ; i++) {
			for (int j = 0 ; j < M1[i].length ; j++ ) {
				System.out.print(Msub[i][j] = M1[i][j] * M2);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}