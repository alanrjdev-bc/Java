package method;

public class Calcultsalary {

	public static void main(String[] args) {
		double result = calculate(2000.1, 2000.3);
		System.out.println(result);

	}

	public static double calculate(double salary, double bonus) {

		double sum = salary + bonus;
		return sum;

	}

}
