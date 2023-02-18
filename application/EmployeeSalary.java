package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeSalary {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionários você deseja cadastrar?");
		int n = sc.nextInt();
		Employee[] emp = new Employee[n];

		for (int i = 0; i < emp.length; i++) {

			System.out.println("Funcionário#" + i + ":");
			System.out.println("Id:");
			int id = sc.nextInt();
			System.out.println("Name:");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Salário inicial:");
			double salary = sc.nextDouble();
			emp[i] = new Employee(name, id, salary, 0.06);
		}
		System.out.println("Deseja aumentar ou diminuir o salário de algum funcionário(s/n)?");
		char resp = sc.next().charAt(0);
		while (resp == 's') {
			System.out.println("Deseja Aumentar ou diminuir(a/d)?");
			resp = sc.next().charAt(0);
			if (resp == 'a') {
				System.out.println("Digite o código do funcionário:");
				int cod = sc.nextInt();
				for (int i = 0; i < emp.length; i++) {
					if (cod == emp[i].getId()) {
						System.out.println("Digite a porcentagem de aumento:");
						double percentage = sc.nextInt();
						emp[i].increaseSalary(percentage);
					} else {
						System.out.println("Código invalido!");
						System.out.println("Digite um código valido:");
						resp = sc.next().charAt(0);
					}
				}
			} else if (resp == 'd') {
				System.out.println("Digite o código do funcionário:");
				int cod = sc.nextInt();
				for (int i = 0; i < emp.length; i++) {
					if (cod == emp[i].getId()) {
						System.out.println("Digite a porcentagem de diminuição:");
						double percentage = sc.nextInt();
						emp[i].toDecreaseSalary(percentage);
					} else {
						System.out.println("Código invalido!");
						System.out.println("Digite um código valido:");
						resp = sc.next().charAt(0);
					}
				}
			}

		}
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		sc.close();
	}

}
