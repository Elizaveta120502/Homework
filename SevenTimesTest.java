package by.htp.task2.main;

import org.junit.Assert;
import org.junit.Test;

public class SevenTimesTest {

	@Test
	public void FindSeven001() {

		int line = 5;
		int column = 3;
		int counter = 1;

		int expected_counter = 7;
		int real_counter;

		real_counter = SevenTimes.FindSeven(line, column, counter);
		Assert.assertEquals(expected_counter, real_counter, 0);
	}

}
