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

    public void addCustomer(String customerName, double transaction) {
        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, transaction);
            customers.add(customer);
            System.out.println("New Customer added " + customer);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }


    public void addTransaction(String name, double transaction) {
        Customer customer = getCustomer(name);
        if(customer != null) {
            customer.transactions().add(transaction);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if(customer == null) {
            return;
        }

        System.out.println("Customer's name " + customer.name());
        System.out.println("Transactions:");
        for (double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
}
