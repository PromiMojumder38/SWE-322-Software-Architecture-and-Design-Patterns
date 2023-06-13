package ConcreteFactory.SolarFlares;

import Product.SolarFlares.AuroraBurst;
import Product.SolarFlares.PowerSurge;
import Product.Obstacle;

public class Level1SolarFlaresFactory extends SolarFlaresFactory {
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new PowerSurge();
        else
            return new AuroraBurst();
    }
}
