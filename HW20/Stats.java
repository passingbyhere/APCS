/*
Team Silver Maple
Elaina Chung, Joshel Xiedeng
APCS1 pd01
HW20 -- GCD Three Ways
2016-10-19
*/

public class Stats{

    //got rid of the fraction parts
    public static int mean(int a, int b){
	return (((a + b)/ 2));
    }

    //also work if it is #.0
    public static double mean(double a, double b){
	return (((a + b)/ 2));
    }

    //if the numbers are equal to each other, it just returned that number.
    public static int max(int a , int b){
	if (a > b){
	    return a;
		}
	else{
	    return b;
		}
    }

    public static double max(double a, double b){
	if (a > b){
	    return a;
		}
	else{
	    return b;
		}
    }
    public static int max(int a, int b, int c){
        if (a > b && a > c){
	    return a;
	}
	if (b > a && b > c){
	    return b;
	}
        else{
	    return c;
	}
    }
    
    public static double max(double a, double b, double c){
	if (a > b && a > c){
	    return a;
	}
        if (b > a && b > c){
	    return b;
	}
        else{
	    return c;
	}
    }
    // geometric mean is when you multiply the variables and get the nth root of them.
    // only worked if i added (int) in front of the int one
     public static int geoMean(int a, int b){
	 return(int)(Math.sqrt((a * b)));
    }

    public static double geoMean(double a, double b){
	 return(Math.sqrt((a * b)));
    }
    //wouldn't work unless I used decimals and i still had to typecast
    public static int geoMean(int a, int b, int c){
	return (int)(Math.pow((a * b *  c),(1.0/3.0)));
    }
    public static double geoMean(double a, double b, double c){
	return (Math.pow((a * b * c),(1.0/3.0)));
    }

    //GCD method
    public static int gcd(int a, int b){
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

    //Euclid's GCD algorithm
    //Step 1: check if one number divides the other.
    //Step 2: If not, subtract the smaller number from the larger number.
    //Step 3: Is the new number 0?
    //Step 3a: If yes, the other number is the gcd.
    //Step 3b: If no, repeat from step 1.
    
    //Euclid's GCD algorithm (recursively)
    public static int gcdER(int a, int b){
	if(b % a == 0){
	    return a;
	}
	else{
	    if(a < b){
		b-=a;
		if (b==0){
			return a;
		    }
		else{
		    return gcdER(a,b);
		}
	    }
            else{
		a-=b;
		if (a==0){
			return b;
		    }
		else{
		    return gcdER(a,b);
		}
	    }
	}
    }

    //Euclid's GCD algorithm (while loop)
    public static int gcdEW(int a, int b){
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

    //Main method for test calls
    public static void main(String[] args){
	System.out.println(gcd(3,2));
	System.out.println(gcd(2,3));
	System.out.println(gcd(6,9));
	System.out.println(gcd(9,6));
	System.out.println(gcd(3,4));
	System.out.println(gcd(4,3));
	System.out.println("===================================");

	System.out.println(gcdER(3,2));
	System.out.println(gcdER(2,3));
	System.out.println(gcdER(6,9));
	System.out.println(gcdER(9,6));
	System.out.println(gcdER(3,4));
	System.out.println(gcdER(4,3));
	System.out.println(gcdER(10,2));
	System.out.println(gcdER(42,7));
	System.out.println(gcdER(18,4));
	System.out.println("===================================");

	System.out.println(gcdEW(3,2));
	System.out.println(gcdEW(2,3));
	System.out.println(gcdEW(6,9));
	System.out.println(gcdEW(9,6));
	System.out.println(gcdEW(3,4));
	System.out.println(gcdEW(4,3));
    }
}
		    
