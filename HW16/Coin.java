 /*
Elaina Chung
APCS pd1
HW #16: Waynes World
2016-10-10
*/
public class Coin{
    //instance variables
    private double value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private double bias;
    //default constructor
    public Coin(){
	value = .01;
	upFace = "tails";
	name = "null";
	flipCtr = 0;
	headsCtr = 0;
	tailsCtr = 0;
	bias = 0.5;
    }
    //1st overloaded constructor with the denomination being indicated
    public Coin(String newname){
	this();
        name = newname;
    }
    //2nd overloaded constructor with the denomination and face being indicated
    public Coin(String newname, String newFace){
	this();
	name = newname;
	upFace = newFace;
    }
    //flip a coin, bias is fair
    public String flip(){
	if ( Math.random()  > bias){
	    upFace = "tails";
	    return upFace ;
	    }
	else{
	    upFace = "heads";
	    return upFace;
	}
    }
    //overwritten toString
    public String toString(){
	return  name + "--" + upFace + "\n";
    }
    //equals function
    public boolean equals(Coin that){
	return (this.upFace).equals(that.upFace);
    }
    //assign values based on the denomination
    public void assignValue(){
	if (name == "penny"){
	    value = 0.01;
	}
	if (name == "nickel"){
	    value = 0.05;
	}
	if (name == "dime"){
	    value = 0.10;
	}
	if (name == "quarter"){
	    value = 0.25;
	}
	else{
	    value = 1.0;
	}
    }
}
