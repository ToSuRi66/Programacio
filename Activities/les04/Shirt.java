public class Shirt {

    public int shirtID = 24698;
    public String description = "Simple shirt";
    public char colorCode = 'Y';
    public double price = 12.99;
    public int quantityInStock = 15;

    public void displayShirtInformation() {
        IO.println("Shirt ID: " + shirtID);
        IO.println("Shirt description: " + description);
        IO.println("Color code: " + colorCode);
        IO.println("Shirt price " + price);
        IO.println("Quantity in stock: " + quantityInStock);

    }
}
