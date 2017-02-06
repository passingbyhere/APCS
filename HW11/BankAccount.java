//Elaina Chung, Team Pad Tai (Elaina Chung, Grace Cuenca, Gilvir Gill)
//APCS pd1
//HW #11: Iterative Improvement ...because, MAKE MORE AWESOME
//2016-09-28
public class BankAccount{
    //instance variables
    private String name;
    private String password;
    private short PIN;
    private int accNum;
    private double balance;
    //default constructor
    public BankAccount(){
        name = "Lorem Ipsum"; //default username
        password = "password"; //default password
	PIN = (short)(0000); //default pin
	accNum = 100000000; //default account number
	balance = 0; //default balance since user hasn't set any
    }
    //used a constructor to set up the BankAccount
    public BankAccount(String newname, String newpass, Short newPIN, int newaccNum, double newbalance){
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
    public void setPIN(short newPIN){
	PIN = newPIN;
    }
    public void setaccNum(int newaccNum){
	accNum = newaccNum;
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
    public void depositandwithdraw(double amount){
	balance += amount;
	System.out.println(balance);
    }
}
