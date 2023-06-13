// Concrete decorator
class ChocolateDecorator extends CakeDecorator {
    public ChocolateDecorator(Cake decoratedCake) {
        super(decoratedCake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}
