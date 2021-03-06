// Team Booyah - Elaina Chung, Brian Kwong
// APCS1 pd1
// HW42 -- Array of Grade 316
// 2016-12-08

/*==================================================
  class SuperArray version 1.0
  Wrapper class for array. Facilitates resizing, 
  expansion, and read/write capability on elements.
  ==================================================*/

public class SuperArray implements ListInt
{
    private int[] _data;  //underlying container structure
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
    public int get( int index ) 
    {
	if ( (index > _lastPos) || (index < 0) ) { // if the index is not a valid location, throw an exception
	    throw new IndexOutOfBoundsException("\nThere is no value at index " + index);
	}
	else {
	    return _data[index];
	}
    }

    //mutator method -- set index to newVal, return old value at index
    public int set( int index, int newVal ) 
    {
        int oldVal = 0;

	try { // if there's a preexisting value at index, save the value and replace index with newVal
	    oldVal = get(index);
	    _data[index] = newVal;
	}
	catch (Exception e) { // if the index is not a valid position, add the newVal to the next avaliable slot, left to right
	    _data[_lastPos+1] = newVal;
	}

	return oldVal;
    }

    //adds an item after the last item
    public void add( int newVal )
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
    public void add( int index, int newVal )
    {
	// int[] b = new int[_data.length];
	// for (int i = 0; i < index; i++) {
	//     b[i] = _data[i];
	// }

	int oldVal = set(index, newVal);

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
	ListInt curtis = new SuperArray();
	System.out.println("Printing empty SuperArray curtis...");
	System.out.println(curtis);

	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set(i,i*2);
	    curtis._size++;
	    curtis._lastPos++;
	}

	System.out.println("Printing populated SuperArray curtis...");
	System.out.println(curtis);

        ListInt mayfield = new SuperArray();
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
