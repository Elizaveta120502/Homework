/*
 * among the array elements with even indices, 
 * find the one that has the maximum value
 * 
 */

package by.htp.task1.main;

public class MaxValue {
	public static void main(String[] args) {

		int box = 0;

		int[] mass = new int[] { 2, 6, 8, 9, 3, 4, 10, 48, 63, 89, 45, 102, 63, 25 };

		System.out.println();

		ViewFilling(mass);
		System.out.println();
		FindMaxValue(mass, box);

	}

	public static int[] ViewFilling(int[] mass) {
		for (int i1 = 0; i1 < mass.length; i1++) {
			System.out.print(mass[i1] + ",");
		}
		return mass;
	}

	public static int FindMaxValue(int mass[], int box) {

		for (int i1 = 0; i1 < mass.length - 2; i1++) {
			if (i1 % 2 == 0) {

				box = mass[i1];
				if (mass[i1] < mass[i1 + 2]) {
					box = mass[i1 + 2];
				} else {
					box = mass[i1];
				}

			}

		}
		System.out.println(box);
		return box;

	}
}
