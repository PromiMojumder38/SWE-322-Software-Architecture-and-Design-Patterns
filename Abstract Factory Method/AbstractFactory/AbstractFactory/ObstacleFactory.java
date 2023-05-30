package AbstractFactory;

import Product.Obstacle;

public abstract class ObstacleFactory {
    public abstract Obstacle createObstacle(int score);
}
