/*
Elaina Chung
Team Pad Tai (Elaina Chung, Grace Cuenca, Gilvir Gill)
APCS pd1
HW12 -- Mo Money Mo Problems
2016-10-04
*/

public class BankAccount{

    //Instance variables
    private String accountName; //alphanumeric string
    private String accountPassword; //aphanumeric string
    private int accountPin; //changed it to an integer because it starts from the number 1000 now
    private int accountNum; ///an integer based 9 digit number, so in the hundred millions. Small enough for integers
    private double accountBalance; //a floating point value that has no theoritical limit, and as such may be best set as a 64bit number

    //default constructor
    public BankAccount(){
	accountName = "Lorem Ipsum"; //default username
	accountPassword = "password"; //default password
	accountPin = 0000; //default pin
	accountNum = 100000000; //default account number
	accountBalance = 0; //default balance since user hasn't set any
    }

    //constructor in which user specifies parameters
    public BankAccount(String name, String pass, int pin, int accNum, double balance){
	accountName = name; //account name equals what the person who summoned the class called it
	accountPassword = pass; //hope you hashed this string
	if(pin < 1000 || pin > 9998){//tests pin to see whether it falls below or above the constraints
	    accountPin = 9999;
	    System.out.println("The PIN you intered in invalid. It has been set to 9999");
	}
	else{//if it falls into the constraints, the PIN is fine
	    accountPin = pin;
	}
	accountPin = pin; //pin that the user set up
	if(accNum < 100000000 || accNum > 999999998){//tests to see whether it falls below or above the constraints
	    accountNum = 999999999;
	    System.out.println("The account number you entered is invalid. It has been set to 999999999");
	}
	else{//if it falls into the constraints, the account number is fine
	    accountNum = accNum;
	}
	accountBalance = balance; //balance that the user set up
    }

    //methods to change values of instance variables
    public void setName(String name){
	accountName = name;
    }

    public void setPassword(String pass){
	accountPassword = pass;
    }

    public void setPin(int pin){
	accountPin = pin;
    }

    public void setNum(int accnum){
	accountNum = accnum;
    }

    public void setBalance(double balance){
	accountBalance = balance;
    }

    //method to print out all the info
    public String toString(){
		return "Account Name: " + accountName + "\nAccount Password: " + accountPassword + "\nAccount Pin: " + accountPin + "\nAccount Number: " + accountNum + "\nAccount Balance: " + accountBalance + "\n==============================";
    }
	public void printInfo() {
		System.out.println(toString());
	}

    //deposit method
    public void deposit(double money){
	accountBalance += money;
    }

    //withdrawl method
    public boolean withdraw(double money){
	if (accountBalance > money){//tests whether the balance is greater than the amount the holder wants to widthdraw
	    accountBalance -= money;
	    return true;
	}
	else{
	    System.out.println("You do not have enough money.");
	    return false;
	}
    }

    //authenticate method
    public boolean authenticate(int accNum, String pass){
	if(accNum == accountNum && pass == accountPassword){
	    System.out.println("That is correct.");
	    return true;
	}
	else{
	    System.out.println("That is incorrect.");
	    return false;
	}
    }

    //main method
    public static void main(String[] args){
	
	//Elaina
	BankAccount EC = new BankAccount("Elaina Chung", "happy", 4455, 123456789, 55.65);
	EC.printInfo();
	EC.setName("Gilvir Gill");
	EC.printInfo();
	EC.withdraw(5.09);
	EC.printInfo();
	EC.withdraw(100.);
	EC.printInfo();
	EC.deposit(999.);
	EC.printInfo();
	EC.withdraw(100.);
	EC.printInfo();
	EC.authenticate(123456789,"happy");
    }
}
