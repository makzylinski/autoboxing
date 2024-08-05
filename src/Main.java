public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob", 200);
        System.out.println(bob);

        Bank bank = new Bank("ING");
        bank.addCustomer("Max", 600.00);
        System.out.println(bank);
        bank.addTransaction("Max", -10.25);
        bank.addTransaction("Max", -75.25);
        bank.printStatement("Max");
    }
}
