package lab1;

import lab1.model.Hero;
import lab1.model.Point;
import lab1.strategy.Fly;
import lab1.strategy.HorseRide;
import lab1.strategy.Walk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero("Jason Statham", new Point(0, 0), new Walk());

        while (true) {
            System.out.println("1 change strategy");
            System.out.println("2 move");
            System.out.println("0 exit");
            System.out.print("choice: ");

            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("1 walk");
                    System.out.println("2 horse ride");
                    System.out.println("3 fly");
                    System.out.print("choice: ");
                    int strat = scanner.nextInt();
                    switch (strat) {
                        case 1 -> hero.setStrategy(new Walk());
                        case 2 -> hero.setStrategy(new HorseRide());
                        case 3 -> hero.setStrategy(new Fly());
                    }
                }
                case 2 -> {
                    System.out.print("x: ");
                    double x = scanner.nextDouble();
                    System.out.print("y: ");
                    double y = scanner.nextDouble();
                    hero.move(new Point(x, y));
                }
            }
            System.out.println();
        }
    }
}
