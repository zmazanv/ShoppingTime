public class Product {

    // Instance Variables
    private String description;
    private double price;
    private Size size;

    // Constructors
    public Product(String description, double price, Size size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    // Getters
    public String getDescription() {
        return this.description;
    }
    public double getPrice() {
        return this.price;
    }
    public Size getSize() {
        return this.size;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    // toString()
    @Override
    public String toString() {
        return "Product: {\n" +
                "\tDescription: " + this.description + ",\n" +
                "\tPrice: " + this.price + ",\n" +
                "\tSize: " + this.size + '\n' +
                '}';
    }

}
