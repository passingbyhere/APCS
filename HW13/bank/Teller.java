/*
Elaina Chung
Team Pad Tai (Elaina Chung, Grace Cuenca, Gilvir Gill)
APCS pd1
HW #13: Outsourcing
2016-10-05
*/

public class Teller{
    public static void main(String args[]){
	BankAccount potato = new BankAccount("Potato","password",10000,1000000000);//creates a new instance of the class BankAccount
	System.out.println(potato.toString());//they overwote the toString() method to print out the user's info
	System.out.println(potato.authenticate(999999999,"password"));//authenticates the user credentials (this one is false)
	System.out.println(potato.authenticate(999999999,"PASSWORD"));//authenticates the user credentials (this one is true)
    }
}
