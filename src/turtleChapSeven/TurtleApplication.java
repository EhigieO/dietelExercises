package turtleChapSeven;

import java.util.Scanner;

public class TurtleApplication {
    public static void main(String[] args) {
        Turtle smartTurtle = new Turtle();
        System.out.println("Welcome to Turtle Graphics");
        String message = """
                1.Pen Down
                2.Pen Up
                3.Turn Right
                4.Turn Left
                5.Move Forward
                6.Display Movement
                7.Exit Turtle
                """;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int userSelect = scanner.nextInt();
        switch (userSelect){
            case 1: smartTurtle.penDown();
                System.out.println("Turtle ready to write");
                break;
            case 2: smartTurtle.penUp();
                System.out.println("Turtle no longer writing");
                break;
            case 3: smartTurtle.turnLeft();
           // if ()
        }
    }
}
