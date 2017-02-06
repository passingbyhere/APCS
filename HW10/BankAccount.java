//Elaina Chung, Team Pad Tai (Elaina Chung, Grace Cuenca, Gilvir Gill)
//APCS pd1
//HW #10: CMYM Dollar Dollar Bills Yall...
//2016-09-27
public class BankAccount{
    //instance variables
    private String name;
    private String password;
    private short PIN;
    private int accNum;
    private double balance;
    //default constructor
    public BankAccount(){
	accountName = "Lorem Ipsum"; //default username
	accountPassword = "password"; //default password
	accountPin = "0000"; //default pin
	accountNum = 100000000; //default account number
	accountBalance = 0; //default balance since user hasn't set any
    }   
    //used a constructor to set up the BankAccount
    public BankAccount(String newname, String newpass, Short newPIN, int newaccNum, double newbalance){
	name = newname;
        password = newpass;
	PIN = newPIN;
	accNum = newaccNum;
	balance = newbalance;
    }
    //method for print it all out
    public void printit(String name, String password, short PIN, int accNum, double balance){
        System.out.println("Account: " + name);
	System.out.println("Password: " + password);
	System.out.println("PIN: " + PIN);
	System.out.println("Account Number: " + accNum);
	System.out.println("Balance: " + balance);
    }
    //methods for depositing and withdrawing
    public void deposit(double amount){
	balance = balance + amount;
	System.out.println(balance);
    }
    public void withdraw(double amount){
	balance = balance - amount;
	System.out.println(balance);
    }
    
}
