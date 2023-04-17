import java.util.Arrays;

public class Student extends Customer {

    // Instance Constants
    final private double DISCOUNT = 0.05;

    // Instance Variables
    final private long studentID;

    // Static Variables
    private static long counter = 0;

    // Constructors
    public Student(String name, Product[] products, Size size) {
        super(name, products, size);
        this.studentID = ++counter;
    }

    // Getters
    public double getDISCOUNT() {
        return this.DISCOUNT;
    }
    public long getStudentID() {
        return this.studentID;
    }

    // toString()
    @Override
    public String toString() {
        return "Student: {\n" +
                "\tName: " + super.getName() + ",\n" +
                "\tStudent Identification Number: " + this.studentID + ",\n" +
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

}
