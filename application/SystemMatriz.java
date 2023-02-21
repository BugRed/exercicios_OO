package application;

import java.util.Scanner;

public class SystemMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o números de linhas:");
		int m = sc.nextInt();
		System.out.println("Digite o número de colunas:");
		int n = sc.nextInt();
		int[][] matz = new int[m][n];

		for (int i = 0; i < matz.length; i++) {
			for (int j = 0; j < matz[i].length; j++) {
				matz[i][j] = sc.nextInt();
			}
		}

		int resp = sc.nextInt();
		
		
		for (int i = 0; i < matz.length; i++) {
			for (int j = 0; j < matz[i].length; j++) {
				if (matz[i][j] == resp) {
					System.out.println("Posição " + i + "," + j + " :");
					if (j > 0) {
						System.out.println("Left:" + matz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up:" + matz[i-1][j]);
					}
					if (j > matz[i].length-1) {
						System.out.println("Right: " + matz[i][j+1]);
					}
					if (i > matz.length-1) {
						System.out.println("Down: " + matz[i+1][j]);
					}
				}
				
			}
		}

		sc.close();
	}

}
