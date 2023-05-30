package ConcreteFactory.DebrisField;

import Product.Obstacle;
import Product.DebrisField.DynamicDebrisField;
import Product.DebrisField.StaticDebrisField;

public class Level1DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new DynamicDebrisField();
        else
            return new StaticDebrisField();
    }
}