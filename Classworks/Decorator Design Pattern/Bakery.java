// Client code
public class Bakery {
    public static void main(String[] args) {
        // Create a basic cake
        Cake basicCake = new BasicCake();

        // Decorate the basic cake with Chocolate
        Cake chocolateCake = new ChocolateDecorator(basicCake);
        System.out.println("Description: " + chocolateCake.getDescription());
        System.out.println("Cost: $" + chocolateCake.getCost());

        // Decorate the chocolate cake with Sprinkles
        Cake chocolateCakeWithSprinkles = new SprinklesDecorator(chocolateCake);
        System.out.println("Description: " + chocolateCakeWithSprinkles.getDescription());
        System.out.println("Cost: $" + chocolateCakeWithSprinkles.getCost());
    }
}