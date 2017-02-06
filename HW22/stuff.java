public class stuff{
    public static String doubleChar(String str){
	String doubles="";
	for(int x = str.length()-1; x>=0; x-=1){
	    doubles+=str.substring(x,x+1)+str.substring(x,x+1);
	}
	return doubles;
    }
}
