public class Main {
    public static void main(String[] args) {


        System.out.println("#### Product ##############################################################");
        // Product
        Product windbreaker = new Product("windbreaker", 50, Size.MEDIUM);
        Product pants = new Product("pants", 30, Size.MEDIUM);
        Product shirt = new Product("shirt", 20, Size.MEDIUM);
        Product shoe = new Product("shoe", 60, Size.MEDIUM);

        System.out.println("---- toString() -----------------------------------------------------------");
        System.out.println(shoe);
        System.out.println("---------------------------------------------------------------------------");


        System.out.println("#### Business #############################################################");
        // Business
        Business nike = new Business("One Bowerman Drive, Beaverton, OR 97005 USA", shoe);

        System.out.println("---- calculateDiscount(Product) -------------------------------------------");
        System.out.println(nike.calculateDiscount(shoe));
        System.out.println("---- toString() -----------------------------------------------------------");
        System.out.println(nike);
        System.out.println("---------------------------------------------------------------------------");


        System.out.println("#### Student ##############################################################");
        // Student
        Student robert = new Student("Robert", new Product[] {windbreaker, pants}, Size.SMALL);

        System.out.println("---- calculateDiscount(Product) -------------------------------------------");
        System.out.println(robert.calculateDiscount(windbreaker));
        System.out.println("---- toString() -----------------------------------------------------------");
        System.out.println(robert);
        System.out.println("---------------------------------------------------------------------------");


        System.out.println("#### Manager ##############################################################");
        // Manager
        Manager david = new Manager("David", new Product[] {shirt, pants}, Size.LARGE);

        System.out.println("---- calculateDiscount(Product) -------------------------------------------");
        System.out.println(david.calculateDiscount(shirt));
        System.out.println("---- printEmployeePriceAfterDiscount(Product) -----------------------------");
        david.printEmployeePriceAfterDiscount(shirt);
        System.out.println("---- toString() -----------------------------------------------------------");
        System.out.println(david);
        System.out.println("---------------------------------------------------------------------------");


        System.out.println("#### ShopApp ##############################################################");
        // ShopApp

        System.out.println("---- printPersonName(Person) ----------------------------------------------");
        ShopApp.printPersonName(david);
        System.out.println("---- calculateTotal(Product[]) --------------------------------------------");
        System.out.println(ShopApp.calculateTotal(new Product[] {windbreaker, shirt, shoe, pants}));
        System.out.println("---- isAFit() -------------------------------------------------------------");
        System.out.println(ShopApp.isAFit(david, pants));
        System.out.println("---- printEveryDiscountAvailableForAProduct(Discountable[], Product) -----");
        ShopApp.printEveryDiscountAvailableForAProduct(new Discountable[] {nike, robert, david}, shoe);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("###########################################################################");
    }
}
