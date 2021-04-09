/*
 * create a two-dimensional array and 
 * find the number of digits 7 in it
 * 
 */

package by.htp.task2.main;

public class SevenTimes {

	public static void main(String[] args) {
		int column = 0;
		int line = 0;
		int counter = 0;

		column = 3;
		System.out.println("Amount of columns: " + column);
		line = 5;
		System.out.println("Amount of lines: " + line + "  ");

		FindSeven(line, column, counter);
		System.out.println();

	}

	public static int FindSeven(int line, int column, int counter) {
		int mass[][] = new int[][] { { 1, 2, 3 }, { 7, 7, 6 }, { 5, 18, 7 }, { 7, 9, 6 }, { 9, 7, 7 } };
		counter = 1;

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.printf("%-4d", mass[i][j]);
				if (mass[i][j] == 7) {
					counter++;
				}

			}
			System.out.println();

		}
		System.out.println("Amount of number 7: " + counter);
		return counter;

	}

}
