package by.htp.task3.logic;

import by.htp.task3.entity.Complex;

import org.junit.Test;
import org.junit.Assert;

public class ComplexTest2 {

	@Test

	public void ComplexMod() {
		Complex obj1 = new Complex(8, 6);
		Complex obj2 = new Complex(10, 16);

		double real_mod_1;
		double real_mod_2;

		double exp_mod_1 = 10.0;
		double exp_mod_2 = 18.867962264113206;

		Complex obj3;

		ComplexLogic logic = new ComplexLogic();
		obj3 = logic.mod(obj1, obj2);

		real_mod_1 = obj3.mod_1;
		real_mod_2 = obj3.mod_2;

		Assert.assertEquals(exp_mod_1, real_mod_1);
		Assert.assertEquals(exp_mod_2, real_mod_2);

	}

}
