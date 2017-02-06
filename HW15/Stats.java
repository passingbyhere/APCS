/*
Elaina Chung
APCS pd1
HW #15: May ah Hahv S’maur, Please?
2016-10-07
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
}

