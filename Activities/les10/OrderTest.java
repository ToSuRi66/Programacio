public class OrderTest {
    public static void main (String[] args){
        Shirt shirt = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();
        Order order = new Order();

        double totalCost = 0.0;
        shirt.price = 14.99;
        shirt2.price = 24.99;
        shirt3.price = 139.99;

        order.addShirt(shirt);
        order.addShirt(shirt2);
        totalCost = order.addShirt(shirt3);
        System.out.printf("Total amount for the order is  $%.2f",totalCost);

    }
}
