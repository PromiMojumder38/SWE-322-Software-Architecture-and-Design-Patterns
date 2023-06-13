// Concrete decorator
class SprinklesDecorator extends CakeDecorator {
    public SprinklesDecorator(Cake decoratedCake) {
        super(decoratedCake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sprinkles";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}