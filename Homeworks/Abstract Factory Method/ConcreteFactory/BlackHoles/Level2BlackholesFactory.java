package ConcreteFactory.BlackHoles;

import Product.Obstacle;
import Product.BlackHoles.MassiveBlackhole;
import Product.BlackHoles.MicroBlackhole;

public class Level2BlackholesFactory extends BlackholesFactory {
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new MassiveBlackhole();
        else
            return new MicroBlackhole();
    }
}