
public class Burger {
    private final double cost;
    private final int cheese;
    private final int patty;
    private final int tomato;
    private final int onions;
    private final int egg;

    private Burger(BurgerBuilder builder) {
        this.cost = builder.getCost();
        this.cheese = builder.cheese;
        this.patty = builder.patty;
        this.tomato = builder.tomato;
        this.onions = builder.onions;
        this.egg = builder.egg;
    }

    public double getCost() {
        return cost;
    }

    public int Cheese() {
        return cheese;
    }

    public int Patty() {
        return patty;
    }

    public int tomato() {
        return tomato;
    }

    public int Onions() {
        return onions;
    }

    public int Eggs() {
        return egg;
    }

    public static class BurgerBuilder {
        private int cheese = 0;
        private int patty = 0;
        private int tomato = 0;
        private int onions = 0;
        private int egg = 0;
        private final int cheesePrice = 20;
        private final int pattyPrice = 25;
        private final int onionPrice = 6;
        private final int tomatoPrice = 10;
        private final int eggPrice = 4;

        public double getCost() {
            return cheese * cheesePrice + patty * pattyPrice + onions * onionPrice + tomato * tomatoPrice
                    + egg * eggPrice;
        }

        public BurgerBuilder cheese() {
            this.cheese++;
            return this;
        }

        public BurgerBuilder egg() {
            this.egg++;
            return this;
        }

        public BurgerBuilder patty() {
            this.patty++;
            return this;
        }

        public BurgerBuilder tomato() {
            this.tomato++;
            return this;
        }

        public BurgerBuilder onions() {
            this.onions++;
            return this;
        }

        public BurgerBuilder eggs() {
            this.egg++;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}