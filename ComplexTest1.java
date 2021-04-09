package by.htp.task3.logic;

import by.htp.task3.entity.Complex;

import org.junit.Assert;
import org.junit.Test;

public class ComplexTest1 {

	@Test

	public void DivTest001() {

		Complex obj1 = new Complex(5, 8);
		Complex obj2 = new Complex(2, 6);

		int real_Re;
		int real_Im;

		int exp_Re = 3;
		int exp_Im = 2;

		Complex obj3;

		ComplexLogic logic = new ComplexLogic();

		obj3 = logic.div(obj1, obj2);

		real_Re = obj3.getRe();
		real_Im = obj3.getIm();

		Assert.assertEquals(exp_Re, real_Re);
		Assert.assertEquals(exp_Im, real_Im);

	}

}
