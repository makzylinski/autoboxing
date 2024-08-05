public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob", 200);
        System.out.println(bob);

        Bank bank = new Bank("ING");
        bank.getCustomer("Bob");
//        Bank bank = new Bank();
//        bank.addCustomer("Max", new ArrayList<>());
//        bank.addTransaction("Max", new ArrayList<>());
//
//        bank.printStatement();
    }
}
