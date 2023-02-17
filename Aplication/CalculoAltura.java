package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class CalculoAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de pessoas que deseja avaliar:");
		int n = sc.nextInt();
		sc.nextLine();

		Person[] vect = new Person[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.println("Digite o nome da pessoa");
			String name = sc.nextLine();
			System.out.println("Digite a idade da pessoa");
			int age = sc.nextInt();
			System.out.println("Digite a altura da pessoa");
			double height = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Person(name, age, height);

		}
		int cont = 0;
		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
			System.out.println("Dados da " + i + "pessoa:");
			System.out.println("Nome: " + vect[i].getName());
			System.out.println("Idade: " + vect[i].getAge());
			System.out.println("Altura: " + vect[i].getHeight());
		}
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				cont++;
			}
		}

		double avg = sum / vect.length;
		System.out.printf("Media: %.2f%n", avg);
		double percent = cont * 100 / vect.length;
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", percent);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}

			sc.close();
		}

	}
}
