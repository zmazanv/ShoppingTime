public class Business implements Discountable {

    // Instance Constants
    private final double DISCOUNT = 0.25;

    // Instance Variables
    private String address;
    private Product product;

    // Constructors
    public Business(String address, Product product) {
        this.address = address;
        this.product = product;
    }

    // Getters
    public String getAddress() {
        return this.address;
    }
    public Product getProduct() {
        return this.product;
    }
    public double getDISCOUNT() {
        return this.DISCOUNT;
    }

    // Setters
    public void setAddress(String address) {
        this.address = address;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    // toString()
    @Override
    public String toString() {
        return "Business: {\n" +
                "\tAddress: " + this.address + ",\n" +
                "\tProduct: " + this.product + ",\n" +
                "\tDiscount Percentage: " + Math.round(this.DISCOUNT * 100) + "%\n" +
                '}';
    }

    // Instance Methods
    @Override
    public double calculateDiscount(Product product) {
        return (product.getPrice() * this.DISCOUNT);
    }

}