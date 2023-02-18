package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductData {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as informações do produto:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println();
		System.out.println("Informações do produto: " + product);

		System.out.println();
		System.out.println("Deseja Adicionar ou Remover itens(s/n)");
		char resp = sc.next().charAt(0);

		while (resp == 's') {

			System.out.println("Adicionar ou remover(a/r)");
			resp = sc.next().charAt(0);

			if (resp == 'a') {

				System.out.println("Quantos itens deseja adicionar no estoque: ");
				quantity = sc.nextInt();
				product.addProducts(quantity);

				System.out.println();
				System.out.println("Informações do produto: " + product);
				System.out.println("Deseja fazer mais alguma coisa s/n");
				resp = sc.next().charAt(0);

			} else if (resp == 'r') {
				System.out.println();
				System.out.println("Quantos itens deseja remover do estoque: ");
				quantity = sc.nextInt();
				product.removeProducts(quantity);

				System.out.println("Informações do produto: " + product);
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