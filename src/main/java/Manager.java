import java.util.Arrays;

public class Manager extends Employee {


    // Instance Constants
    final private double MANAGERIALDISCOUNT = super.getDISCOUNT() + 0.05;

    // Constructors
    public Manager (String name, Product[] products, Size size) {
        super(name, products, size);
    }

    // toString()
    @Override
    public String toString() {
        return "Employee: {\n" +
                "\tName: " + super.getName() + ",\n" +
                "\tEmployee Identification Number: " + this.getEmployeeID() + ",\n" +
                "\tProducts:\n\t" + Arrays.toString(this.getProducts()) + ",\n" +
                "\tSize: " + this.getSize() + ",\n" +
                "\tDiscount Percentage: " + Math.round(this.MANAGERIALDISCOUNT * 100) + "%\n" +
                '}';
    }

    // Instance Methods


    @Override
    public double calculateDiscount(Product product) {
        return (product.getPrice() * this.MANAGERIALDISCOUNT);
    }
}