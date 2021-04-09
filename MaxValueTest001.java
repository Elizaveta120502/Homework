package by.htp.task1.main;

import org.junit.Assert;
import org.junit.Test;

public class MaxValueTest001 {

	@Test
	public void FindMax() {
		int expected_box = 63;
		int real_box;
		int test_box = 0;

		int[] test_arr = new int[] { 2, 6, 8, 9, 3, 4, 10, 48, 63, 89, 45, 102, 63, 25 };
		real_box = MaxValue.FindMaxValue(test_arr, test_box);
		Assert.assertEquals(expected_box, real_box, 0);

	}

}
