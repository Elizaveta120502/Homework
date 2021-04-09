package by.htp.task3.main;

import java.util.Scanner;

import by.htp.task3.entity.Complex;
import by.htp.task3.logic.ComplexLogic;
import by.htp.task3.presentation.ComplexPresentation;

public class ComplexMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int my_im_1 = 0;
		int my_re_1 = 0;
		int my_im_2 = 0;
		int my_re_2 = 0;

		System.out.println("Enter first complex number.Real: ");
		my_im_1 = sc.nextInt();
		System.out.println("Imagine: ");
		my_re_1 = sc.nextInt();

		System.out.println("Enter second complex number.Real: ");
		my_im_2 = sc.nextInt();
		System.out.println("Imagine: ");
		my_re_2 = sc.nextInt();

		Complex f1 = new Complex(my_re_1, my_im_1);
		Complex f2 = new Complex(my_re_2, my_im_2);
		Complex f3;

		Complex f1_mod = new Complex(my_re_1, my_im_1);
		Complex f2_mod = new Complex(my_re_2, my_im_2);

		ComplexLogic log = new ComplexLogic();
		ComplexPresentation view = new ComplexPresentation();

		f3 = log.sum(f1, f2);
		view.ViewSum(f1, f2, f3);

		f3 = log.div(f1, f2);
		view.ViewDiv(f1, f2, f3);

		f3 = log.mod(f1_mod, f2_mod);
		view.ViewMod(f1_mod, f2_mod, f3);
	}

}
