package ConcreteFactory.EnemyShips;

import Product.Obstacle;
import Product.EnemyShips.BomberShip;
import Product.EnemyShips.FighterShip;

public class Level1EnemyShipsFactory extends EnemyShipsFactory {
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new BomberShip();
        else
            return new FighterShip();
    }
}
