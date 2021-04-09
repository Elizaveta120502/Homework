package by.htp.task4.main;

public class Function {

	public static int GetNumber(int number) {

		int sqare = 0;

		if (number > 0) {

			sqare = (int) Math.pow(number, 2);

		}

		if (number < 0) {
			sqare = (int) Math.pow(number, 4);
			System.out.println(number);

		}

		return sqare;

	}
}
