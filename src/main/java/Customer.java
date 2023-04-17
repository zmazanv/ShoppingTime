import java.util.Arrays;

public abstract class Customer extends Person implements Discountable {

    // Instance Variables
    private Product[] products;
    private Size size;

    // Constructors
    public Customer(String name, Product[] products, Size size) {
        super(name);
        this.products = products;
        this.size = size;
    }

    // Getters
    public Product[] getProducts() {
        return this.products;
    }
    public Size getSize() {
        return this.size;
    }

    // Setters
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    // toString()
    @Override
    public String toString() {
        return "Customer: {" +
                "\tName: " + this.getName() + ",\n" +
                "\tProducts: " + Arrays.toString(this.products) + ",\n" +
                "\tSize: " + this.size + '\n' +
                '}';
    }

}