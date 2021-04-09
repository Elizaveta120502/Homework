package by.htp.task3.entity;

public class Complex {

	private int Im;
	private int Re;
	public double mod_1;
	public double mod_2;

	public Complex(double mod1, double mod2) {

		mod_1 = mod1;
		mod_2 = mod2;

	}

	public Complex(int im, int re) {
		Im = im;
		Re = re;

	}

	public int getIm() {
		return Im;
	}

	public void setIm(int im) {
		Im = im;
	}

	public int getRe() {
		return Re;
	}

	public void setRe(int re) {
		Re = re;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Im;
		result = prime * result + Re;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		if (Im != other.Im)
			return false;
		if (Re != other.Re)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fraction [Real =" + Re + ", Imagine=" + Im + "]";
	}

}
