//Elaina Chung
//APCS pd1
//HW48 -- Halving the Halves
//2016-12-19

/*============================================
  class OrderedArrayList
  Wrapper class for ArrayList.
  Imposes the restriction that stored items 
  must remain sorted in ascending order
  ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;


public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;
    private int min = 0;
    private int max = _data.size() - 1;

    // default constructor initializes instance variable _data
    public OrderedArrayList() {
	_data = new ArrayList<Comparable>();
    }


    public String toString() { 
	return _data.toString();
    }


    public Comparable remove( int index ) { 
	return _data.remove(index);
    }


    public int size() { 
	return _data.size();
    }

    
    public Comparable get( int index ) { 
	return _data.get(index);
    }



    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear( Comparable newVal ) {
	for(int i = 0; i < _data.size(); i++){
	    if(newVal.compareTo(_data.get(i)) < 0){//compares newVal with each element at index i 
		_data.add(i,newVal);//if _data.get(i) is greater than newVal then newVal is inserted at index i
		return;//stops the method
	    }
	}
	_data.add(newVal);
    }

    //addBinary takes an input of any comparable object
    //uses binary search to look for the index where to insert the value.
    public void addBinary(Comparable newVal)
    {
        int midPt = (max + min) / 2;
	if(min == max){
	    _data.add(midPt + 1 , newVal);
	}
	else{
	    if(newVal.compareTo(_data.get(midPt)) < 0){
		


    // main method solely for testing purposes
    public static void main( String[] args ) {


	OrderedArrayList Franz = new OrderedArrayList();
	System.out.println("\nValues to add via addLinear() calls:");
	
	// testing linear search
	for( int i = 0; i < 15; i++ ) {
	    int valToAdd = (int)( 50 * Math.random() );
	    System.out.println( valToAdd );
	    Franz.addLinear( valToAdd );
	}

	System.out.println("\nafter population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
 
