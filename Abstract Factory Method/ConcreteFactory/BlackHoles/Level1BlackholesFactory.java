package ConcreteFactory.BlackHoles;

import Product.Obstacle;
import Product.BlackHoles.KerrBlackhole;
import Product.BlackHoles.MicroBlackhole;

public class Level1BlackholesFactory extends BlackholesFactory {
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new KerrBlackhole();
        else
            return new MicroBlackhole();
    }
}