package ConcreteFactory.Asteroids;

import Product.Obstacle;
import Product.Asteroids.Ice_Asteroids;
import Product.Asteroids.Iron_Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if (score > 500)
            return new Ice_Asteroids();
        else
            return new Iron_Asteroids();
    }
}