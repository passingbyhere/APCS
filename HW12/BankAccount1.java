//Elaina Chung, Team Pad Tai (Elaina Chung, Grace Cuenca, Gilvir Gill)
//APCS pd1
//HW #12: Mo Money Mo Problems
//2016-10-01
public  class BankAccount1{
    //instance variables
    private String name;
    private String password;
    private int   PIN;
    private int accNum;
    private double balance;
    //default constructor
    public BankAccount(){
        name = "Lorem Ipsum"; //default username
        password = "password"; //default password
	PIN = (1000); //default pin
	accNum = 100000000; //default account number
	balance = 0; //default balance since user hasn't set any
    }
    //used a constructor to set up the BankAccount
    public BankAccount(String newname, String newpass, int newPIN,  int newaccNum, double newbalance){
	name = newname;
        password = newpass;
	PIN = newPIN;
	accNum = newaccNum;
	balance = newbalance;
    }
    //mutators to set the variables
    public void setName(String newName){
	name = newName;
    }
    public void setPassword(String newPass){
        password = newPass;
    }
    public void setPIN(int   newPIN){
	if (newPIN >= 1000 && newPIN <= 9998){
	    PIN = newPIN;
	}
	else{
	    PIN = 9999;
	    System.out.println("Invalid PIN: Must be between 1000 and 9998");
	}
    }
    public void setaccNum(int newaccNum){
        if (newaccNum >= 100000000 && newaccNum  <= 999999998){
	    accNum  = newaccNum;
	}
	else{
	    accNum = 999999999;
	    System.out.println("Invalid Account Number");		       
	}
    }
    public void setBalance(double newBalance){
	balance = newBalance;
    }
    //method for print it all out
    public void printit(){
        System.out.println("Account: " + name);
	System.out.println("Password: " + password);
	System.out.println("PIN: " + PIN);
	System.out.println("Account Number: " + accNum);
	System.out.println("Balance: " + balance);
    }
    //methods for depositing and withdrawing
    //If you want to withdraw, use a negative number
    public boolean depositandwithdraw(double amount){
	if (amount <= balance){
	            balance += amount;
		    return true;
	}
	else{
	    balance = balance;
	    System.out.println("Not enough money");
	    return false;
	}	    
    }
    public boolean authenticate(int thisaccNum, String thispassword){
	if(password == thispassword && accNum == thisaccNum){
	    return true;
	}
	else{
	    return false;
	}
    }
    public static void main(String[] args){
        BankAccount bob = new BankAccount();
       bob.setName("Bob");
       bob.setPassword("bobisawesome");
       bob.setPIN(0000);
       bob.setPIN(1111);
       bob.setaccNum(000000000);
       bob.setaccNum(111111111);	
       bob.setBalance(100.00);
       bob.depositandwithdraw(101.00);
       bob.depositandwithdraw(90.50);
       bob.printit();
       bob.authenticate(123456789, "bobsucks");
       bob.authenticate(111111111, "bobisawesome");
    }
}
