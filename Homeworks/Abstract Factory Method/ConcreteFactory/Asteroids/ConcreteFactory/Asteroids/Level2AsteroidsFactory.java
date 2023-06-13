package ConcreteFactory.Asteroids;

import Product.Obstacle;
import Product.Asteroids.Rocky_Asteroids;
import Product.Asteroids.Silicon_Asteroids;

public class Level2AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if (score > 1000)
            return new Rocky_Asteroids();
        else
            return new Silicon_Asteroids();
    }
}