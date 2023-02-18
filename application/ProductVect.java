package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductVect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o núemro de produtos que deseja adicionar");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {

			sc.nextLine();
			System.out.println("Digite o nome do produto");
			String name = sc.nextLine();
			System.out.println("Digite o valor do produto");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double media = sum / vect.length;

		System.out.printf("Media:%.2f%n", media);

		sc.close();
	}

}
