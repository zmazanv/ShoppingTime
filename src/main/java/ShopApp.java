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
    public static void printEveryDiscountAvailableForAProduct(Discountable[] discountables, Product product) {
        for (Discountable discountable : discountables) {
            System.out.println("Discount for " + discountable.getClass().getName() + ": $" + (discountable.calculateDiscount(product)));
        }
    }

}
