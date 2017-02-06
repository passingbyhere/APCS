// Adris Jaoutakas
// APCS1 pd1
// HW #12: Mo Money Mo Problems 
// 2016-10-05
// Team Accountables

public class BankAccount {

    public final static int ACCOUNT_NUMBER_MIN = 100000000;
    public final static int ACCOUNT_NUMBER_MAX = 999999998;
    public final static int PIN_MIN = 1000;
    public final static int PIN_MAX = 9998;
    private String userName;
    private String password;
    private float balance;
    private int pin;
    private int accountNumber;

    //overwritten constructor
    public BankAccount(String userName, String password, int pin, int accountNumber) {
        setName(userName);
        setPassword(password);
        setPin(pin);
        setAccountNumber(accountNumber);
        balance = 0.0f;
    }

    //method to set name
    public void setName(String userName) {
        this.userName = userName;
    }

    //method to set password
    public void setPassword(String password) {
        this.password = password; // this is the least secure thing I have ever seen
    }

    //method to set balance
    public void setBalance(float balance) {
        this.balance = balance;
    }

    //method to set pin
    public void setPin(int pin) {
        if ((pin < PIN_MIN) || (pin > PIN_MAX)) {
            pin = 9999;
            printValueError("Pin Number",pin,PIN_MIN,PIN_MAX);
        }
        this.pin = pin;
    }

    //method to set account number
    public void setAccountNumber(int accountNumber) {
        if ((accountNumber < ACCOUNT_NUMBER_MIN) || (accountNumber > ACCOUNT_NUMBER_MAX)) {
            accountNumber = 999999999;
            printValueError("Account Number",accountNumber,ACCOUNT_NUMBER_MIN,ACCOUNT_NUMBER_MAX);
        }
        this.accountNumber = accountNumber;
    }

    //method to deposit
    public void deposit(float money) {
        balance += money;
    }

    //method to withdraw
    public boolean withdraw(float money) {
        if ((balance - money) < 0) {
            System.err.println("BankAccount Error: Attempted to withdraw more money than available.");
            System.err.print("Balance: ");
            System.err.println(balance);
            System.err.print("Attempted to withdraw: ");
            System.err.println(money);
            return false;
        }
        balance -= money;
        return true;
    }

    /* authenticate
       Verifies user with account number and password
        arguments: Account number and Password
        returns: Whether inputed account number and password match those of the class

    */
    public boolean authenticate(int number, String password) {
        // Very secure.
        // Not.
        return ((this.accountNumber == accountNumber) && (this.password == password));
    }

    /* printValueError
       Util function for printing an error.
       Made to simplify printing for incorrectly inputed values
        arguments: Values as strings which determine the invalid value, its minimum, maximim etc.
        returns: Nothing
    */
    private void printValueError(String valueName, int value, int valueMin, int valueMax) {
        System.err.print("BankAccount Error: Invalid "); 
        System.err.print(valueName);
        System.err.print(": ");
        System.err.print(value);
        System.err.print(". Value should be between ");
        System.err.print(valueMin);
        System.err.print(" and ");
        System.err.print(valueMax);
        System.err.println(".");
    }

    //overwritten toString() method
    public String toString() {
        return "(BankAccount:" + 
            "\n name: " + userName + 
            "\n pin: " + pin + 
            "\n accountNumber: " + accountNumber + 
            "\n balance: " + balance + ")";
    }
    
    //main method (implemented in Teller.java
    
    public static void main(String args[]) {
        BankAccount potato = new BankAccount("Potato","password",10000,1000000000);
        System.out.println(potato.toString());
        System.out.println(potato.authenticate(999999999,"password"));
        System.out.println(potato.authenticate(999999999,"PASSWORD"));
    }
}
