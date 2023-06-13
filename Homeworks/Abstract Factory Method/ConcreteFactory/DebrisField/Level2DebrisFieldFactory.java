package ConcreteFactory.DebrisField;

import Product.Obstacle;
import Product.DebrisField.PersistentDebrisField;
import Product.DebrisField.StaticDebrisField;

public class Level2DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new PersistentDebrisField();
        else
            return new StaticDebrisField();
    }
}