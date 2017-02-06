public class Test {

    public static void main(String[] args) {

        BankAccount RichardGreen = new BankAccount("Richard Green", "pa55w0rd",(short)(2222), 123456789, (double)(1000.0));
        RichardGreen.printit();
        RichardGreen.depositandwithdraw(55);
        RichardGreen.setPassword("testpass");
        RichardGreen.printit();

        BankAccount GeorgeBrown = new BankAccount("George Brown", "passwordd",(short)(3562),123456789,(double)(55.0));
        GeorgeBrown.printit();
        GeorgeBrown.depositandwithdraw(-22.1);
        GeorgeBrown.printit();

        BankAccount TestPerson = new BankAccount();
        TestPerson.setPIN((short)(2849));
        TestPerson.printit();
    }
}
