
// Concrete component
class BasicCake implements Cake {
    @Override
    public String getDescription() {
        return "Basic Cake";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}