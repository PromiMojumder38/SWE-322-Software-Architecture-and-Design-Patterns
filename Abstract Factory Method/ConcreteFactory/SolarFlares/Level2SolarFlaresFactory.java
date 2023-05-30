package ConcreteFactory.SolarFlares;

import Product.SolarFlares.AuroraBurst;
import Product.SolarFlares.SolarStorm;
import Product.Obstacle;

public class Level2SolarFlaresFactory extends SolarFlaresFactory {
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new SolarStorm();
        else
            return new AuroraBurst();
    }
}
