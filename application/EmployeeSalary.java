package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//import java.util.stream.Collectors;

import entities.Employee;

public class EmployeeSalary {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionários você deseja cadastrar?");
		int n = sc.nextInt();
		List<Employee> listEmployee = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("  ");
			System.out.printf("Dados  do funcionario:# %d%n", (i + 1));
			System.out.println("Id:");
			int id = sc.nextInt();
			while (hasId(listEmployee, id)) {
				System.out.println("Esse id já existe");
				System.out.println("Digite um id valido:");
				id = sc.nextInt();
			}
			System.out.println("Nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salário inicial:");
			double initialSalary = sc.nextDouble();
			Employee emp = new Employee(name, id, initialSalary, 0.06);

			listEmployee.add(emp);
		}
		System.out.println("Deseja aumentar salário de funcionario(s/n)?");

		char resp = sc.next().charAt(0);
		while (resp == 's') {
			System.out.println("Entre com o codigo do funcionario:");
			int cod = sc.nextInt();

			Employee emp = listEmployee.stream().filter(x -> x.getId() == cod).findFirst().orElse(null);

			// Integer pos = position(listEmployee, cod);
			if (emp == null) {
				System.out.println("Esse id não existe!");
			} else {
				System.out.print("Digite a porcentagem de aumento");
				double percentage = sc.nextDouble();
				emp.increaseSalary(percentage);

			}
			for (Employee e : listEmployee) {
				System.out.println(e);
			}

			/*
			 * Validação de Id Employee emp = listEmployee.stream().filter(x -> x.getId() ==
			 * cod).findFirst().orElse(null); if (emp == null) {
			 * System.out.println("Esse id não existe!"); } else {
			 * 
			 * }
			 * 
			 * for (Employee x : listEmployee.stream().filter(x -> x.getId() ==
			 * cod).collect(Collectors.toList())) {
			 * System.out.println("Digite a porcentagem de aumento"); double percentage =
			 * sc.nextDouble();
			 * 
			 * }
			 */

		}
		System.out.println("Fim do programa!");
		sc.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;

	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
