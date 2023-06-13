// Decorator abstract class
abstract class CakeDecorator implements Cake {
    protected Cake decoratedCake;

    public CakeDecorator(Cake decoratedCake) {
        this.decoratedCake = decoratedCake;
    }

    public String getDescription() {
        return decoratedCake.getDescription();
    }

    public double getCost() {
        return decoratedCake.getCost();
    }
}
