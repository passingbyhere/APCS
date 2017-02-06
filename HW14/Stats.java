/*
Elaina Chung
APCS pd1
HW #14: stAtistically sPeaking
2016-10-06
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
    // only worked if i added (int) in front of the int one
     public static int geoMean(int a, int b){
	 return(int)(Math.sqrt((a * b)));
    }
    public static double geoMean(double a, double b){
	    return(Math.sqrt((a * b)));
    }
}
