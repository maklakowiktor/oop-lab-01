package lab1.strategy;

import lab1.model.Point;

public class Walk implements MoveStrategy {
    @Override
    public void move(Point from, Point to) {
        System.out.printf("walks from %s to %s (distance: %.1f)%n", from, to, from.distanceTo(to));
    }
}
