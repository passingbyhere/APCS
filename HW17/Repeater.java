public class Repeater{
    //while loop fucntion
    public static String fenceW(int posts){
        String fence;
	if (posts <= 0){
	    return "";//returns nothing when posts are less than or euqal to 0
	}
	else {
	    fence = "|";//when the posts equal one/ when it starts
	    posts -= 1;
	    while(posts > 0){
		fence+="--|";//adds --| each time 
		posts-=1;//subtracts one from posts until it equals zero
	    }
	    return fence;
	}
    }
    public static String fenceR(int posts){
	String fence;
	if(posts == 0){

    public static void main(String[] args){
	System.out.println(fenceW(1));
	System.out.println(fenceW(2));
    }

}
