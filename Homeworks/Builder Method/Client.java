public class Client {
    public static void main(String[] args) {
        Burger Burger = new Burger.BurgerBuilder().cheese().onions().patty().tomato().cheese().egg().tomato().cheese()
                .build();
        // every time ingredients will be added 1 by 1 according to client's choice

        System.out.println("Number of cheeses " + Burger.Cheese());
        System.out.println("Number of onions " + Burger.Onions());
        System.out.println("Number of tomatoes " + Burger.tomato());
        System.out.println("Number of patties " + Burger.Patty());
        System.out.println("Number of eggs " + Burger.Eggs());
        System.out.println("Total costs " + Burger.getCost());
    }
}