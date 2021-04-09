package by.htp.task3.presentation;

import by.htp.task3.entity.Complex;

public class ComplexPresentation {

	public void ViewSum(Complex f1, Complex f2, Complex f3) {
		System.out.println("(" + f1.getRe() + " + " + f1.getIm() + "i" + ")" + "+" + "(" + f2.getRe() + " + "
				+ f2.getIm() + "i" + ")" + "=" + f3.getRe() + " + " + f3.getIm() + "i");
	}

	public void ViewDiv(Complex f1, Complex f2, Complex f3) {
		System.out.println("(" + f1.getRe() + " + " + f1.getIm() + "i" + ")" + "-" + "(" + f2.getRe() + " + "
				+ f2.getIm() + "i" + ")" + "=" + f3.getRe() + " + " + f3.getIm() + "i");
	}

	public void ViewMod(Complex f1_mod, Complex f2_mod, Complex f3) {
		System.out.println("|" + f1_mod.getRe() + "+" + f1_mod.getIm() + "i|=" + f3.mod_1);
		System.out.println("|" + f2_mod.getRe() + "+" + f2_mod.getIm() + "i|=" + f3.mod_2);
	}
}
