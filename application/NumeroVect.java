package application;

import java.util.Scanner;

public class NumeroVect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vect = new double[n];
		if (n < 10) {
			for (int i = 0; i < vect.length; i++) {
				System.out.println("Digite um número inteiro");
				vect[i] = sc.nextInt();
			}

			System.out.println("Digite um numero menor que 10");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		}
		sc.close();
	}

}
