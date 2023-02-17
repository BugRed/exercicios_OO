package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class SistemRoom {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Person[] vectRoom = new Person[10];

		System.out.println("Deseja alugar um quarto(s/n)?");
		char resp = sc.next().charAt(0);
		sc.nextLine();
		if (resp == 's') {
			System.out.println("Quantos quartos deseja alugar");
			int quantity = sc.nextInt();
			System.out.println("Por favor adicione seus dados:");
			for (int i = 1; i <= quantity; i++) {
				System.out.println("Aluguel# " + i + ":");
				System.out.println("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Email: ");
				String email = sc.next();
				System.out.println("Número do quarto");
				int roomNumber = sc.nextInt();
				vectRoom[roomNumber] = new Person(name, email);

			}
			System.out.println("Quartos alugados: ");
			for (int i = 0; i < vectRoom.length; i++) {
				if (vectRoom[i] != null) {
					System.out.println(i + ":" +vectRoom[i]);
				}
			}
			for (Person obj : vectRoom) {
				System.out.println(obj);
			}

		}
		sc.close();
	}

}