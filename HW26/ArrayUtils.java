/*
 Elaina Chung
 APCS pd1
 HW #26: I Demand Arrays!
 2016-11-2 
*/
public class ArrayUtils{
    /*=====================
      pre: array of ints
      post: String of the array of ints
      =====================*/
    public static String toString(int[] arr){
	String str = "";
	for(int s:arr){
	    str+=s;
	}
	return str;
    }
    /*====================
      pre: array of ints
      post: array of ints with values
      ====================*/
    public static int[] populate(int[] arr){
	for(int x=0; x<arr.length;x+=1){
	    arr[x]=(int)(Math.random() * 100);
	}
	return arr;
    }
    public static void main(String[] args){
	int[] arr;
	arr = new int[10];
	System.out.println(toString(arr));
	System.out.println(populate(arr));
	arr = populate(arr);
	System.out.println(toString(arr));
    }
}
