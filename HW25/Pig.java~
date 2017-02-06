/*
  Elaina Chung
  APCS pd1
  HW #24: Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
  2016-10-29
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
      PROTIP: Make this class compilable first, 
      then develop and test one method at a time.
      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class Pig 
{
    //Q: How does this initialization make your life easier?
    //A: You could use it to search for a vowel in a string
    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") → true  
      hasA("cat", "p") → false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	for(int x=0; x<w.length(); x+=1){
	    if(w.substring(x,x+1).equals(letter)){
		return true;
	    }
	}
	return false;
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {
        for(int x=0; x<VOWELS.length(); x+=1){
	    if(VOWELS.substring(x,x+1).equals(letter)){
		return true;
	    }
	}
	return false;
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") → 3
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
      post: hasAVowel("cat") → true
      hasAVowel("zzz") → false
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
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") → "eaa"
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
    public static String engToPig( String w ) 
    {
	String pig="";
        if(w.length()==0){
	    return w;
	}
	else{
	    if(beginsWithVowel(w)){
		pig+=w+"way";
	    }
	    else{
		pig+=firstVowel(w)+w.substring((w.indexOf(firstVowel(w)))+1)+w.substring(0,(w.indexOf(firstVowel(w))))+"ay";
	    }
	}
	return pig;
    }


    public static void main( String[] args ) {
	System.out.println(hasA("cat", "a"));
	System.out.println(hasA("cat", "p"));
	System.out.println(isAVowel("a"));
	System.out.println(isAVowel("p"));
	System.out.println(countVowels("meatball"));
	System.out.println(hasAVowel("cat"));
	System.out.println(hasAVowel("zzz"));
	System.out.println(allVowels("meatball"));
	System.out.println(allVowels("zzzzzzzzz"));
	System.out.println(firstVowel(""));
	System.out.println(firstVowel("zzz"));
	System.out.println(firstVowel("meatball"));
	System.out.println(beginsWithVowel("apple"));
	System.out.println(beginsWithVowel("strong"));
	System.out.println(engToPig("apple"));
	System.out.println(engToPig("strong"));
	System.out.println(engToPig("java"));
    }//end main()

}//end class Pig


