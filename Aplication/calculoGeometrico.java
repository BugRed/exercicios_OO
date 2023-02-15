package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Rectangle;

public class CalculoGeometrico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rt = new Rectangle();

		System.out.println("Enter rectangle width: ");
		rt.width = sc.nextDouble();
		System.out.println("Enter rectangle height");
		rt.height = sc.nextDouble();

		System.out.println(rt);

		sc.close();

	}

}
