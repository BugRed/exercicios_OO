package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeSalary {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();

		System.out.println("Digite o nome do Funcionario:");
		emp.name = sc.nextLine();
		System.out.println("Digite o salário bruto:");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Digite o imposto sobre o salário:");
		emp.tax = sc.nextDouble();
		
		System.out.println("Funcionario: " + emp);
		System.out.println(" ");
		System.out.println("Você deseja dar um aumento a esse funcionario(s/n)");
		char resp = sc.next().charAt(0);
		
		 while (resp == 's') {
			 System.out.println("Quanto você deseja aumentar o salário");
			 double percentage = sc.nextDouble();
			 emp.increaseSalary(percentage);
			 System.out.println("Salário aumentado para:" + emp);
			 System.out.println("Ainda deseja aumentar esse salário(s/n)");
			 resp = sc.next().charAt(0);
		 }
		 System.out.println("Fim do processo");
		
		sc.close();
	}

}
