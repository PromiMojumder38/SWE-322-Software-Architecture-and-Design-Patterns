package ConcreteFactory.EnemyShips;

import Product.Obstacle;
import Product.EnemyShips.AlienShip;
import Product.EnemyShips.FighterShip;

public class Level2EnemyShipsFactory extends EnemyShipsFactory {
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new AlienShip();
        else
            return new FighterShip();
    }
}
