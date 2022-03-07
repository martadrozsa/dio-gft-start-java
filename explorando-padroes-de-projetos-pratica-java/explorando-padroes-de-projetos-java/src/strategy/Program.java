package strategy;

public class Program {
    public static void main(String[] args) {

        Behavior normalBehavior = new NormalBehavior();
        Behavior defensiveBehavior = new DefensiveBehavior();
        Behavior aggressiveBehavior = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normalBehavior);

        robot.move();
        robot.move();

        robot.setBehavior(defensiveBehavior);
        robot.move();

        robot.setBehavior(aggressiveBehavior);
        robot.move();
        robot.move();
        robot.move();

    }
}
