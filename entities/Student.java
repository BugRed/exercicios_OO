package entities;

public class Student {

	public static String name;
	public static double av1;
	public static double av2;
	public static double av3;

	public static double finalGrade() {
		return av1 + av2 + av3;
	}

	public static double missingPoint() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}

	}

}
