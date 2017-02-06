/*
  Team Egg
  Elaina Chung, Grace Cuenca, Gilvir Gill
  APCS pd1
  HW #25: ? ? ?
  2016-10-31
*/
//class Pig
//a Pig Latin translator
//SKELETON

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
           9
     ,--.-'-,--.
     \  /-~-\  /
    / )' a a `( \
   ( (  ,---.  ) )
    \ `(_o_o_)' /
     \   `-'   /
      | |---| |
      [_]   [_]
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
import java.util.Scanner;
public class Pig
{

    private static final String VOWELS = "aeiouAEIOU";
    private static final String YY = "yY"; // for y when it's a vowel
    private static final String PUNCS=".?!,;/ ";
    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") --> true
      hasA("cat", "p") -->  false
      =====================================*/
    public static boolean hasA( String w, String letter )
    {
        return w.indexOf(letter) != -1;
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter )
    {
        return VOWELS.indexOf(letter)!=-1;
    }

    /*=====================================
      boolean isY(String)--tells if y
      pre: w != null
      post: true/false
      =====================================*/
    public static boolean isY(String letter)
    {
	return YY.indexOf(letter) !=-1;
    }

    public static boolean isPunc(String letter)
    {
	return PUNCS.indexOf(letter) !=-1;
    }
    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -->  3
      =====================================*/
    public static int countVowels( String w )
    {
        int count=0;
	for(int x=0; x<w.length(); x+=1){
	    if(isAVowel(w.substring(x,x+1))){
		count+=1;
	    }
	}
	return count;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") --> true
      hasAVowel("zzz") --> false
      =====================================*/
    public static boolean hasAVowel( String w )
    {
        for(int x=0; x<w.length(); x+=1){
	    if(isAVowel(w.substring(x,x+1))){
		return true;
	    }
	}
	return false;
    }

    /*=====================================
      boolean hasY(String)--tells when if a string doesn't have a vowel, that it has a vowel.
      pre: w != null
      post: true/false
      =====================================*/
    public static boolean hasYVowel(String w)
    {
	    for(int x=1; x<w.length()-1; x+=1) {
            //if it's a y and its surounded by nonvowels, its basically a vowel
		    if(isY(w.substring(x,x+1)) && !isAVowel(w.substring(x-1,x)) && !isAVowel(w.substring(x+1,x+2))){
		        return true;
		}
	    }
	    return false;
	}

    public static boolean hasPuncs(String w)
    {
	for(int x=0; x<w.length(); x+=1){
	    if(PUNCS.indexOf(w.substring(x,x+1)) != 1){
		return true;
	    }
	}
	return false;
    }

    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") --> "eaa"
      =====================================*/
    public static String allVowels( String w )
    {
        String vowels="";
	if(hasAVowel(w)){
	    for(int x=0; x<w.length(); x+=1){
		if(isAVowel(w.substring(x,x+1))){
		    vowels+=w.substring(x,x+1);
		}
	    }
	    return vowels;
	}
	else{
	    return vowels;
	}
    }


    /*=====================================
      String firstVowel(String) -- returns first vowel in a String
      pre:  w != null
      post: firstVowel("") --> ""
      firstVowel("zzz") --> ""
      firstVowel("meatball") --> "e"
      =====================================*/
    public static String firstVowel( String w )
    {
        String vowel=allVowels(w);
	if (vowel.equals("")){
	    return "";
	}
	else{
	    return vowel.substring(0,1);
	}
    }

    /*====================================
      String firstY(String) -- return first y
      pre: w!= null
      post: String
      ====================================*/
    public static String firstYVowel(String w)
    {
	for(int x=1;x<w.length()-1;x+=1){
	    if(!isAVowel(w.substring(x-1,x)) && !isAVowel(w.substring(x+1,x+2)) && (w.substring(x, x+1).equals("y") || w.substring(x,x+1).equals("Y"))) {
		return w.substring(x,x+1);
	    }
	}
	return "";
    }

    /*=====================================
      boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
      pre:  w != null and w.length() > 0
      post: beginsWithVowel("apple")  --> true
      beginsWithVowel("strong") --> false
      =====================================*/
    public static boolean beginsWithVowel( String w )
    {
        return isAVowel(w.substring(0,1));
    }


    /*=====================================
      String engToPig(String) -- converts an English word to Pig Latin
      pre:  w.length() > 0
      post: engToPig("apple")  --> "appleway"
      engToPig("strong") --> "ongstray"
      engToPig("java")   --> "avajay"
      =====================================*/
    public static String engToPig( String w ) {
        String pig = "";
        //if null, return null
	    if(w.length() <= 0) {
            return pig;
	    }
        //if theres punctuation, recursively slice it
	    if(hasPuncs(w)){
		    for(int x=0; x<w.length(); x+=1){
		        if(isPunc(w.substring(x, x+1))) {
			        return engToPig(w.substring(0,x))+w.substring(x,x+1)+engToPig(w.substring(x+1))+"\n";
		        }
		}
        //if it begins with a vowel, just add way to the end
	    }
	    if(beginsWithVowel(w)) {
		    pig+=w+"way";
	    }
		else if(hasYVowel(w)) {
		    int yX = w.indexOf(firstYVowel(w));
		    pig+=w.substring(yX) + w.substring(0,yX)+"ay ";
		}
		else {
		    int vX  = w.indexOf(firstVowel(w));
		    pig+=w.substring(vX) + w.substring(0,vX)+"ay ";
		}
	   return pig;
    }

    public static void main( String[] args ) {
	Scanner sc = new Scanner(System.in);
	while( sc.hasNext() ) {
	    System.out.println(engToPig(sc.next()) );
	}

    }//end main()

}//end class Pig
