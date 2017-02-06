public class theBank{
    public static  void main( String[] args ){
	BankAccount bob = new BankAccount("Bob", "bobisawesome",(short)(1234) ,123456789, (double)(0.0));
	bob.deposit((double)(10.00));
        bob.withdraw((double)(9.00));
        bob.printit("Bob", "bobisawesome",(short)(1234) ,123456789, (double)(0.00));
	
    }
}
	
	
