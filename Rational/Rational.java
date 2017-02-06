//Elaina Chung
//APCS pd1
//HW#37 -- Be More Rational
//2016-11-30

public class Rational implements Comparable{
    private int numerator;
    private int denominator;
    public Rational(){
	numerator = 0;
	denominator = 1;
    }
    public Rational(int n, int d){
	this();
	if(d == 0){
	    numerator = 0;
	    denominator = 1;
	}
	else{
	    numerator = n;
	    denominator = d;
	}
    }
    public String toString(){
	return numerator + "/" + denominator;
    }
    //returns floating point of n/d
    //It seems like I only needed to typecast one value for float typecasting
    public static float floatValue(Rational r){
	return (float)r.numerator / r.denominator;
    }
    //multiplies this by r, changes this and r stays the same
    public void multiply(Rational r){
        this.numerator *= r.numerator;
	this.denominator *= r.denominator;
    }
    //divides this by r, changes this and r stays the same
    public void divide(Rational r){
	this.numerator *= r.denominator;
	this.denominator *= r.numerator;
    }
    //adds this by r, changes this and r stays the same
    public void add(Rational r){
	if(this.denominator == r.denominator){
	    this.denominator = this.denominator;
	    this.numerator += r.numerator;
	}
	else{
	    this.numerator = ((r.denominator * this.numerator) + (this.denominator * r.numerator));
	    this.denominator = (this.denominator * r.denominator);
	}
	
    }
    //subtracts this by r, changes this and r stays the same
    public void subtract(Rational r){
	if(this.denominator == r.denominator){
	    this.denominator = this.denominator;
	    this.numerator += r.numerator;
	}
	else{
	    this.numerator = ((r.denominator * this.numerator) - (this.denominator * r.numerator));
	    this.denominator = (this.denominator * r.denominator);
	}
	
    }
    //finds the gcd
    public static int gcd(int a, int b){
	while (!(b%a==0)){
	    if(a < b){
		b-=a;
		    }
	    else{
		a-=b;
		    }
	}
	if(a < b){
	    return a;
		}
	else{
	    return b;
		}
    }
    //finds the gcd static
    public static int sgcd(int a, int b){
        int x = 1;//Starts from one
	int answer = 1;//placeholder for GCD
	while(x<=Math.min(a,b)){
	    if(a%x==0 && b%x==0){
		answer = x;
		x += 1;
	    }
	    else{
		x += 1;
	    }
	}
	return answer;
    }
    //reduces the rational
    public void reduce(){
	this.numerator /=  gcd(this.numerator,this.denominator);
	this.denominator /= gcd(this.numerator,this.denominator);
    }
    //takes a rational and compares it to this
    public int compareTo(Object r){
	Rational roo = (Rational)r;
	if(this.numerator * roo.denominator == roo.numerator * this.denominator) {
	    return 0;
	}
	if(this.numerator * roo.denominator > roo.numerator * this.denominator){
	    return 1;
	}
	else{
	    return -1;
	}
    }
    public static void main(String[] args){
	Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
	Rational t = new Rational(4,18);
	Rational u = new Rational(2,9);
	System.out.println(r);
	System.out.println(s);
	System.out.println(floatValue(s));
	System.out.println("=========================");
	/*
	r.multiply(s);
	System.out.println(r);
	System.out.println(s);
	System.out.println("=========================");
	r.divide(s);
	System.out.println(r);	
	System.out.println(s);
	System.out.println("=========================");
	r.add(s);
	System.out.println(r);	
	System.out.println(s);
	System.out.println("=========================");
	r.subtract(s);
	System.out.println(r);	
	System.out.println(s);
	*/
	System.out.println(t);
	System.out.println(floatValue(t));
	System.out.println(sgcd(t.numerator,t.denominator));
        t.reduce();
	System.out.println(t);
	System.out.println(r.compareTo(s));
	System.out.println(floatValue(t));
	System.out.println(floatValue(u));
	System.out.println(t.compareTo(u));
    }
}
