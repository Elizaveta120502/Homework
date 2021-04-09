package by.htp.task3.logic;

import by.htp.task3.entity.Complex;

import org.junit.Test;
import org.junit.Assert;

public class ComlexTest {

	@Test
	public void SumTest001() {
		Complex obj1 = new Complex(2, 8);
		Complex obj2 = new Complex(3, 10);

		int real_Re;
		int real_Im;

		int exp_Re = 5;
		int exp_Im = 18;

		Complex obj3;
		ComplexLogic logic = new ComplexLogic();
		obj3 = logic.sum(obj1, obj2);
		real_Re = obj3.getRe();
		real_Im = obj3.getIm();

		Assert.assertEquals(exp_Re, real_Re);
		Assert.assertEquals(exp_Im, real_Im);

	}
}
