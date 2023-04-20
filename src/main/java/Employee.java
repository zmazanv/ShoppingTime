import java.util.Arrays;

public abstract class Employee extends Customer {

    // Instance Constants
    protected final double DISCOUNT = 0.1;

    // Instance Variables
    final private long employeeID;

    // Static Variables
    private static int counter = 0;

    // Constructors
    public Employee (String name, Product[] products, Size size) {
        super(name, products, size);
        this.employeeID = ++counter;
    }

    // Getters
    public double getDISCOUNT() {
        return this.DISCOUNT;
    }
    public long getEmployeeID() {
        return this.employeeID;
    }

    // toString()
    @Override
    public String toString() {
        return "Employee: {\n" +
                "\tName: " + super.getName() + ",\n" +
                "\tEmployee Identification Number: " + this.employeeID + ",\n" +
                "\tProducts:\n\t" + Arrays.toString(this.getProducts()) + ",\n" +
                "\tSize: " + this.getSize() + ",\n" +
                "\tDiscount Percentage: " + (this.DISCOUNT * 100) + "%\n" +
                '}';
    }

    // Instance Methods
    @Override
    public double calculateDiscount(Product product) {
        return (product.getPrice() * this.DISCOUNT);
    }
    public void printEmployeePriceAfterDiscount(Product product) {
        System.out.println("Employee Price for " + product.getDescription() + " After Discount: $" + (product.getPrice() - this.calculateDiscount(product)));
    }

}