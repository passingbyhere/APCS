// Elaina Chung
// APCS1 pd1
// HW44 -- In America, the Driver Sits on the Left
// 2016-12-12

/*==================================================
  class SuperArray version 1.0
  Wrapper class for array. Facilitates resizing, 
  expansion, and read/write capability on elements.
  ==================================================*/

public class SuperArray implements List
{
    private Object[] _data;  //underlying container structure
    private int _lastPos; //marker for last meaningful value
    private int _size;    //number of meaingful values

    //default constructor
    //initializes 10-item array
    public SuperArray() 
    { 
        _data = new int[10];
	_lastPos = -1;
	_size = 0;
    }

    //output array in [a,b,c] format
    //eg, for int[] a = {1,2,3} ...
    //toString() -> "[1,2,3]"
    public String toString() 
    { 
	String retStr = "[";
	for (int i = 0; i < _lastPos; i++) {
	    retStr += _data[i] + ",";
	}
	if (_lastPos != -1) {
	    retStr += _data[_lastPos];
	}
	retStr += "]";
	return retStr;
    }

    //double capacity of this instance of SuperArray 
    private void expand() 
    { 
        int[] a = new int[_data.length * 2]; // temp array
	for (int i = 0; i < _data.length; i++) { // copies all the preexisting elements into the new array
	    a[i] = _data[i];
	}
	_data = a; // replace the old array with the expanded array
    }

    //accessor method -- return value at specified index
    public Object get( int index ) 
    {
	if ( (index > _lastPos) || (index < 0) ) { // if the index is not a valid location, throw an exception
	    throw new IndexOutOfBoundsException("\nThere is no value at index " + index);
	}
	else {
	    return _data[index];
	}
    }

    //mutator method -- set index to newVal, return old value at index
    public Object set( int index, Object newVal) 
    {
        Object oldVal = _data[index];
	_data[index] = newVal;
	return oldVal;
    }

    //adds an item after the last item
    public boolean add( Object newVal )
    {
	if ( _size > _data.length ) {
	    expand();
	}
        set(-1, newVal);
	_lastPos++;
	_size++;
    }

    //inserts an item at index
    //shifts existing elements to the right
    public void add( int index, Object newVal )
    {
	// int[] b = new int[_data.length];
	// for (int i = 0; i < index; i++) {
	//     b[i] = _data[i];
	// }

	Object oldVal = set(index, newVal);

	_lastPos++;
	_size++;
	
	for (int i = index+1; i < _size; i++) {
	    oldVal = set(i, oldVal);
	    // System.out.println("Starting debugging...");
	    // System.out.println( toString() );
	}

	// _data = b;
    }

    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public void remove(int index)
    {
	// int[] b = new int[_data.length];
	// for (int i = 0; i < index; i++) {
	//     b[i] = _data[i];
	// }

	for (int i = index; i < _lastPos; i++){
	    set(i, _data[i + 1]);
	}
	_lastPos--;
	_size--;

	// _data = b;
	
    }

    //return number of meaningful items in _data
    public int size()
    {
	
	return _size;
    }

    //main method for testing
    public static void main( String[] args ) 
    {
        List bob = new SuperArray();
	//typecasting
	SuperArray curtis = (SuperArray) bob;
	System.out.println("Printing empty SuperArray curtis...");
	System.out.println(curtis);

	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set(i,i*2);
	    curtis._size++;
	    curtis._lastPos++;
	}

	System.out.println("Printing populated SuperArray curtis...");
	System.out.println(curtis);

        List mayfields = new SuperArray();
	SuperArray mayfield = (SuperArray) mayfields;
	System.out.println("Printing empty SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.add(5);
	mayfield.add(4);
	mayfield.add(3);
	mayfield.add(2);
	mayfield.add(1);

	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);
	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);

	mayfield.add(3,99);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(2,88);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(1,77);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
    }//end main()

}//end class SuperArray

