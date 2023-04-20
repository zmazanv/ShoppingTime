public class ShopApp {

    // Static Methods
    public static void printPersonName(Person person) {
        System.out.println(person.getName());
    }
    public static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    public static boolean isAFit(Customer customer, Product product) {
        return false;
    }
String hello = String.format("I have %,.2f bugs to fix.", 476578.09876);
    public static void printEveryDiscountAvailableForAProduct(Discountable[] discountables, Product product) {
        for (Discountable discountable : discountables) {
            System.out.println("Discount for " + discountable.getClass().getName() + ": $" + String.format("%,.2f", (discountable.calculateDiscount(product))));
        }
    }

}
