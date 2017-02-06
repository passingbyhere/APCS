/*
Elaina Chung
Team Pad Tai (Elaina Chung, Grace Cuenca, Gilvir Gill)
APCS pd1
HW #13: Outsourcing
2016-10-05
*/
public class Teller{
    //placed everything in the main method of the team's BankAccount into Teller's main method to test it.
    public static void main(String args[]){

	BankAccount potato = new BankAccount("Potato","password",10000,1000000000);
	System.out.println(potato.toString());
	System.out.println(potato.authenticate(999999999,"password"));
	System.out.println(potato.authenticate(999999999,"PASSWORD"));
    }
}
