/*
  Elaina Chung
  APCS pd1
  HW27 -- Recurse, Recurse, on Elements Not the First!
  2016-11-03
*/
public class Loopier{
    public static String toString(int[] arr){
	String str = "";
	for(int s:arr){
	    str+=s;
	}
	return str;
    }
    /*=====================
      iterative for loop
      precond: array of ints and searched int
      postcond: index of searched init or -1
      =====================*/
    public static int linSearch(int[] a, int target){
	for(int x=0; x<a.length; x+=1){
	    if( a[x] == target){
		return x;
	    }
	}
	return -1;
    }
    /*=====================
      recursion
      precond: array of ints and searched int
      postcond: index of searched init or -1
      =====================*/
    public static int linSearchR(int[] a, int target){
	if(a.length==0){
	    return -1;
	}
	if(a[a.length-1]==target){
	    return a.length-1;
	}
	else{
	    int[] newA=new int[a.length-1];
	    for(int s=0; s<newA.length; s+=1){
		newA[s] = a[s];
	    }
	    return linSearchR(newA,target);
	}
    }
    /*=====================
      iterate for loop
      precond: array of ints, searched int
      postcond: number of instances of searched int
      =====================*/
    public static int freq(int[] a, int target){
	int count = 0;
	for(int x = 0; x<a.length; x+=1){
	    if(a[x]==target){
		count+=1;
	    }
	}
	return count;
    }
    /*=====================
      recursion
      precond: array of ints, searched int
      postcond: number of instances of searched int
      =====================*/
    public static int freqRec(int[] a, int target){
	if(a.length==0){
	    return 0;
	}
	if(a[a.length-1]==target){
	    int[] newA=new int[a.length-1];
	    for(int s=0; s<newA.length; s+=1){
		newA[s] = a[s];
	    }
	    return 1 + freqRec(newA,target);
	}
	else{
	    int[] newA=new int[a.length-1];
	    for(int s=0; s<newA.length; s+=1){
		newA[s] = a[s];
	    }
	    return freqRec(newA,target);
	}
    }	    
   
    public static void main(String[] arrgs){
	int[] a = {1,2,2,4,5,1,3};
	System.out.println(linSearch(a,2));
	System.out.println(linSearch(a,10));
        System.out.println(linSearchR(a,2));
	System.out.println(linSearchR(a,5));
	System.out.println(linSearchR(a,10));
	System.out.println(freq(a,2));
	System.out.println(freq(a,10));
	System.out.println(freqRec(a,2));
	System.out.println(freqRec(a,10));
    }
}
