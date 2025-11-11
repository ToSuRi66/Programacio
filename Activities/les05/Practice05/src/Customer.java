public class Customer {

    public int CustomerID = 1;
    public char status = 'N';
    public double totalPurchases = 0.0;

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + CustomerID);
        System.out.println("Customer Status: " + status);
        System.out.println("Total Purchases: " + totalPurchases);
    }

}
