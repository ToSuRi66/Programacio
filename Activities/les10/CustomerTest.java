public class CustomerTest {
    public static void main (String[] args) {

        Customer c1 = new Customer(),
                c2 = new Customer();

        c1.setCustomerInfo(1,"Tomeu Quely","Riera 2","111-222-3333");
        c2.setCustomerInfo(2,"Lolaco Lel","Murada 69","333-222-1111","lel@lolaco.net");

        c1.displayCustomer();
        c2.displayCustomer();

    }
}
