public class CustomerTest {
    public static void main(String[] args) {

        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

        cust1.customerID = 1;
        cust1.name = "John Doe";
        cust1.emailAddress = "jdoebusiness@business.com";
        cust2.customerID = 2;
        cust2.name = "Jeremy Clarkson";
        cust2.emailAddress = "jeremyclarkson@jcindustries.com";

        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();

        cust2 = cust1;

        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();

    }
}
