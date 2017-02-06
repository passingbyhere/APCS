//Elaina Chung
//APCS pd1
//HW47 -- Keep Guessing
//2016-12-15
import cs1.Keyboard;
public class GuessNumber
{
    public static int winner = (int)(Math.random() * 100) + 1;
    public static int min = 1;
    public static int max = 100;
    public static int guess;
    public static int attempts = 0;

    public static boolean check(int i)
    {
	if(i == winner){
	    s = "Correct! It took" + attempts + "guesses.";
	    return true;
        }
	else{
	    if(i < winner){
		min = i + 1;
		s = "Too low, try again...";
	    }
	    if(i > winner){
		max = i - 1;
		s = "Too high, try again...";
	    }
	    return false;
	}
    }
    public static void main(String[] args)
    {
	System.out.println(winner);
    }
}
