/**
 *Elaina Chung
 *APCS1 pd1
 *HW #08: On the Origins of a BigSib
 *2016-09-23
 */
public class BigSib{
    
    public BigSib(){
	helloMsg = "Hello";
    }
    public BigSib(String newMsg){
	helloMsg = newMsg;
    }
    
    private String helloMsg;
    
    public void setHelloMsg(String newMsg){
	helloMsg = newMsg;
    }
    public String greet(String name){
	return helloMsg + " " + name;
    }
}
