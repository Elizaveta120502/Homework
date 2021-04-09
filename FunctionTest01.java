package by.htp.task4.main;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest01 {

	@Test
	public void sqrtX001() {
		int number1 = 5;
		int number2 = 2;
		int number3 = 3;

		int realx1 = 0;
		int realx2 = 0;
		int realx3 = 0;

		int expectedx1 = 25;
		int expectedx2 = 4;
		int expectedx3 = 9;

		realx1 = Function.GetNumber(number1);
		realx2 = Function.GetNumber(number2);
		realx3 = Function.GetNumber(number3);
		Assert.assertEquals(expectedx1, realx1, 0.0000001);
		Assert.assertEquals(expectedx2, realx2, 0.0000001);
		Assert.assertEquals(expectedx3, realx3, 0.0000001);
	}

	@Test
	public void duplexX002() {
		int number1 = -5;
		int number2 = -2;
		int number3 = -3;

		int realx1 = 0;
		int realx2 = 0;
		int realx3 = 0;

		int expectedx1 = 625;
		int expectedx2 = 16;
		int expectedx3 = 81;

		realx1 = Function.GetNumber(number1);
		realx2 = Function.GetNumber(number2);
		realx3 = Function.GetNumber(number3);
		Assert.assertEquals(expectedx1, realx1, 0.0000001);
		Assert.assertEquals(expectedx2, realx2, 0.0000001);
		Assert.assertEquals(expectedx3, realx3, 0.0000001);
	}

}
