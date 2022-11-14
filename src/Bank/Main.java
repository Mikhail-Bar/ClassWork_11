package Bank;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Customers customers = new Customers();
        customers.addCustomer(new Customer(123,987654321,"Ivan","Ivanov","Ivanovich"),0);
        customers.addCustomer(new Customer(234,987654321,"Petr","Petrov","Petrovich"),1);
        customers.addCustomer(new Customer(456,987654321,"Ivan","Sidorov","Ivanovich"),2);
        customers.addCustomer(new Customer(567,987654321,"Ivan","Petrov","Ivanovich"),3);

        customers.sort();
        System.out.println();
        customers.print();
        System.out.println();
        customers.printSomeNumbers(234,456);

    }
}
