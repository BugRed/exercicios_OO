package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Digite as informações do produto:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Deseja Adicionar ou Remover itens(s/n)");
		char resp = sc.next().charAt(0);
		int quantity = 0;

		while (resp == 's') {

			System.out.println("Adicionar ou remover(a/r)");
			resp = sc.next().charAt(0);

			if (resp == 'a') {

				System.out.println("Enter the number of products to be added in stock: ");
				quantity = sc.nextInt();
				product.addProducts(quantity);

				System.out.println();
				System.out.println("Updated data: " + product);
				System.out.println("Deseja fazer mais alguma coisa s/n");
				resp = sc.next().charAt(0);

			} else if (resp == 'r') {
				System.out.println();
				System.out.println("Enter the number of products to be removed in stock: ");
				quantity = sc.nextInt();
				product.removeProducts(quantity);

				System.out.println("Update data: " + product);
				System.out.println("Deseja fazer mais alguma coisa s/n");
				resp = sc.next().charAt(0);

			} else {
				System.out.println("Deseja fazer mais alguma coisa s/n");
			}
		}
		System.out.println("Programa finalizado!");

		sc.close();
	}
}
