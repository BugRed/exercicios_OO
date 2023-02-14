package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student sdt = new Student();

		System.out.println("Qual nome do aluno:");
		sdt.name = sc.nextLine();
		System.out.println("Digite as três notas:");
		sdt.av1 = sc.nextDouble();
		sdt.av2 = sc.nextDouble();
		sdt.av3 = sc.nextDouble();
		System.out.printf("Nota Final: %.2f%n", sdt.finalGrade());

		if (sdt.finalGrade() < 60.0) {
			System.out.println("Reprovado!");
			System.out.printf("Faltam %.2f Pontos para recuperar.", sdt.missingPoint());
		}else {
			System.out.println("Parabéns, você está aprovado!");
		}

		sc.close();
	}
}
