package oops;

public class Fraction {
	
	private int denominator;
	private int numerator;
	
	Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
		simplify(this.numerator, this.denominator);
	}
	
	
	private void simplify(int numerator, int denominator) {
		if(denominator == 0) return;
		int min = Math.min(numerator, denominator);
		int gcd = 1;
		for(int i=2; i<=min; i++) {
			if(numerator%i == 0 && denominator%i == 0) {
				gcd = i;
			}
		}
		this.numerator = this.numerator/gcd;
		this.denominator = this.denominator/gcd;	
	}
	
	public Fraction add(int numerator, int denominator) {
		int num = this.numerator*denominator + this.denominator*numerator;
		int den = this.denominator*denominator;
		return new Fraction(num,den);
	}
	
	public Fraction sub(int numerator, int denominator) {
		int num = this.numerator*denominator - this.denominator*numerator;
		int den = this.denominator*denominator;
		return new Fraction(num,den);
	}
	
	public void print() {
		if(this.denominator == 0)
			System.out.println(this.numerator);
		else
			System.out.println(this.numerator+"/"+this.denominator);
	}
}
