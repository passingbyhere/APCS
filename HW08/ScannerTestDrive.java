import java.util.Scanner;
public class ScannerTestDrive {
    private static final String VOWELS = "aeiou";
    public static void main( String[] args ) {
	Scanner sc = new Scanner(System.in);
	while( sc.hasNext() ) {
	    System.out.println(engToPig(sc.next()) );
	}
    }//end main()

    public static boolean isAVowel( String letter ) 
    {
        for(int x=0; x<VOWELS.length(); x+=1){
	    if(VOWELS.substring(x,x+1).equals(letter)){
		return true;
	    }
	}
	return false;
    }

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

     public static boolean hasAVowel( String w ) 
    {
        for(int x=0; x<w.length(); x+=1){
	    if(isAVowel(w.substring(x,x+1))){
		return true;
	    }
	}
	return false;
    }

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

    public static boolean beginsWithVowel( String w ) 
    {
        return isAVowel(w.substring(0,1));
    }

    public static String engToPig( String w ) 
    {
	String pig="";
	if(beginsWithVowel(w)){
	    pig+=w+"way";
	}
	else{
	    pig+=firstVowel(w)+w.substring((w.indexOf(firstVowel(w)))+1)+w.substring(0,(w.indexOf(firstVowel(w))))+"ay";
	}
	return pig;
    }

}//end class

