package by.htp.task3.logic;

import by.htp.task3.entity.Complex;

public class ComplexLogic {

	public Complex sum(Complex f1, Complex f2) {
		int newRe;
		int newIm;

		newRe = f1.getRe() + f2.getRe();
		newIm = f1.getIm() + f2.getIm();

		Complex result = new Complex(newIm, newRe);
		return result;
	}

	public Complex div(Complex f1, Complex f2) {
		int newRe;
		int newIm;

		newRe = f1.getRe() - f2.getRe();
		newIm = f1.getIm() - f2.getIm();

		Complex result = new Complex(newIm, newRe);

		return result;
	}

	public Complex mod(Complex f1_mod, Complex f2_mod) {
		double mod_1;
		double mod_2;

		mod_1 = Math.sqrt(Math.pow((f1_mod.getRe()), 2) + Math.pow((f1_mod.getIm()), 2));
		mod_2 = Math.sqrt(Math.pow((f2_mod.getRe()), 2) + Math.pow((f2_mod.getIm()), 2));
		Complex result = new Complex(mod_1, mod_2);

		return result;
	}
}
