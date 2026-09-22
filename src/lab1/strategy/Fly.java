package lab1.strategy;

import lab1.model.Point;

public class Fly implements MoveStrategy {
    @Override
    public void move(Point from, Point to) {
        System.out.printf("flies from %s to %s (distance: %.1f)%n", from, to, from.distanceTo(to));
    }
}
