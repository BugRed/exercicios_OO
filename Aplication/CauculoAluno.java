package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class CauculoAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Qual nome do aluno:");
		Student.name = sc.nextLine();
		System.out.println("Digite as três notas:");
		Student.av1 = sc.nextDouble();
		Student.av2 = sc.nextDouble();
		Student.av3 = sc.nextDouble();
		System.out.printf("Nota Final: %.2f%n", Student.finalGrade());

		if (Student.finalGrade() < 60.0) {
			System.out.println("Reprovado!");
			System.out.printf("Faltam %.2f Pontos para recuperar.", Student.missingPoint());
		}else {
			System.out.println("Parabéns, você está aprovado!");
		}

		sc.close();
	}
}
