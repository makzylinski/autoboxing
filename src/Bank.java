import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName) {
        for(var customer : customers) {
            System.out.println(customer);
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }

        System.out.println("Customer not found");

        return null;
    }

    public void addCustomer(String name, ArrayList<Double> transaction) {
        for(int i = 0; i <= customers.size() - 1; i++) {
            if(!customers.get(i).name().equals(name)) {
                Customer customer = new Customer(name, transaction);
                customers.add(customer);
                System.out.println("New Customer added: " + customer);
            }
        }
    }
//
//    public void addTransaction(String name, ArrayList<Double> transaction) {
//        for(int i = 0; i <= customers.size() - 1; i++) {
//            if(customers.get(i).getName().equals(name)) {
//                customers.get(i).setTransactions(transaction);
//            }
//        }
//    }
//
//    public void printStatement() {
//        for (int i = 0; i <= customers.size() - 1; i++) {
//            System.out.println("Statement for user " + customers.get(i).getName() +
//                    ", transactions " + customers.get(i));
//        }
//    }
}
