import AbstractFactory.ObstacleFactory;
import ConcreteFactory.Asteroids.*;
import ConcreteFactory.DebrisField.*;
import ConcreteFactory.BlackHoles.*;
import ConcreteFactory.SolarFlares.*;
import ConcreteFactory.EnemyShips.*;
import Product.Obstacle;

public class Client {
    public static void main(String[] args) {
        int level = (int) (Math.random() * 2) + 1;

        ObstacleFactory factory;

        // Asteroids Factory

        if (level == 1)
            factory = new Level1AsteroidsFactory();
        else
            factory = new Level2AsteroidsFactory();

        int score = (int) (Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        // DebrisField Factory

        if (level == 1)
            factory = new Level1DebrisFieldFactory();
        else
            factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        // SolarFlares Factory

        if (level == 1)
            factory = new Level1SolarFlaresFactory();
        else
            factory = new Level2SolarFlaresFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        // Enemy Ships Factory

        if (level == 1)
            factory = new Level1EnemyShipsFactory();
        else
            factory = new Level2EnemyShipsFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        // Black holes Factory

        if (level == 1)
            factory = new Level1BlackholesFactory();
        else
            factory = new Level2BlackholesFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

    }
}