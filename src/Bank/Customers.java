package Bank;

import java.util.Arrays;
import java.util.Comparator;

public class Customers {
    private Customer[] customers = new Customer[4];

    public void addCustomer(Customer customer, int index){
        customers[index] = customer;
    }
    public void sort(){
        Comparator<Customer> comparator = (c1, c2) -> c1.getLastName().compareTo(c2.getLastName());
        Arrays.sort(customers , comparator);
    }
    public void print() {
        for (Customer customerAll : customers)
            System.out.println(customerAll);
    }
    public void printSomeNumbers(long begin, long end){
        for (Customer customerAll:customers)
            if (customerAll.getNumCreditCard()>=begin && customerAll.getNumCreditCard()<=end)
                System.out.println(customerAll.toString());
    }

}
