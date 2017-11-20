/*Addison Huang
  APCS pd1
  HW36 -- Be Rational
  2017 11 17*/

public class Rational {
    //instance vars
    private int numerator;
    private int denominator;

    //default constructor, default is 0/1
    public Rational() {
	numerator = 0;
	denominator = 1;
    }
    //overloaded constructor takes in 2 ints
    //sets Rational to x/y unless y is 0
    //if y is 0 it becomes 0/1
    public Rational(int num, int den) {
	this();
	if (den != 0) {
	    numerator = num;
	    denominator = den;
	}
	else {
	    System.out.println("Denominator can't be 0");
	}
    }
    
    //overwritten toString that returns x/y
    public String toString() {
	return numerator + "/" + denominator;
    }
    
    //returns the float of the #
    public double floatValue() {
	return (double)numerator/denominator;
    }

    //multiplies rational 1 by rational 2 and rational 1 changes
    public void multiply(Rational x) {
	numerator = this.numerator * x.numerator;
	denominator = this.denominator *  x.denominator;
    }
    
    //same as multiplies but with dividing
    public void divide(Rational x) {
	if (x.numerator != 0) {
	    numerator = this.numerator / x.numerator;
	    denominator = this.denominator /x.denominator;
	}
	else {
	    System.out.println("You can't divide by 0");
	}
    }

    //adds one rational # to another and does not simplify
    public void add(Rational x) {
	numerator = (this.numerator * x.denominator) + (this.denominator * x.numerator);
	denominator = this.denominator * x.denominator;
    }

    //works the same as add but it subtracts instead
    public void subtract(Rational x) {
	numerator = (this.numerator * x.denominator) - (this.denominator * x.numerator);
	denominator = this.denominator * x.denominator;
    }

    
    public static int gcdEW() {
	int a = this.denominator;
	int b = this.numerator;
	    while (a != b) {
		int bigger = max(a,b);
		int smaller = min(a,b);
		int diff = bigger - smaller;
		a = smaller;
		b = diff;
	    }
	    return a;
	}
	

    //main method
    public static void main(String[] args) {
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
	System.out.println(r);
	//t.reduce(); //Changes t to 2/9
    }
}
