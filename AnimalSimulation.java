package Simulator;
import animals.*;
import java.util.*;

public class AnimalSimulation {
    public static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the board size (n): ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of animals per type (k): ");
        int k = scanner.nextInt();

        if (n < 6 || n > 25 || k < 2 || k > 5) {
            System.out.println("Invalid input. n must be 6-25 and k must be 2-5.");
            return;
        }

        Board board = initializeBoard(n, k);
        int time = 0;
        System.out.println("Time t = " + time++ + ": ");
        board.display();

        for (; board.simulateStep() && time <= 50; time++) {
            System.out.println("Time t = " + time + ": ");
            board.display();
        }
        System.out.println("End of simulation ");
        scanner.close();
    }

    private static Board initializeBoard(int n, int k) {
        Board board = new Board(n);
        int id = 0;

        // Adding predators (Cat, Alligator, Fox, Eagle)
        for (int i = 0; i < k; i++) {
            while (true) { // Adding Cat
                int x = random.nextInt(n);
                int y = random.nextInt(n);
                if (board.isEmpty(x, y)) {
                    board.addAnimal(new Cat(id++, x, y));
                    break;
                }
            }

            while (true) { // Adding Alligator
                int x = random.nextInt(n);
                int y = random.nextInt(n);
                if (board.isEmpty(x, y)) {
                    board.addAnimal(new Alligator(id++, x, y));
                    break;
                }
            }

            while (true) { // Adding Fox
                int x = random.nextInt(n);
                int y = random.nextInt(n);
                if (board.isEmpty(x, y)) {
                    board.addAnimal(new Fox(id++, x, y));
                    break;
                }
            }

            while (true) { // Adding Eagle
                int x = random.nextInt(n);
                int y = random.nextInt(n);
                if (board.isEmpty(x, y)) {
                    board.addAnimal(new Eagle(id++, x, y));
                    break;
                }
            }
        }

        // Adding prey (Mouse, Rabbit)
        for (int i = 0; i < k; i++) {
            while (true) { // Adding Mouse
                int x = random.nextInt(n);
                int y = random.nextInt(n);
                if (board.isEmpty(x, y)) {
                    board.addAnimal(new Mouse(id++, x, y));
                    break;
                }
            }

            while (true) { // Adding Rabbit
                int x = random.nextInt(n);
                int y = random.nextInt(n);
                if (board.isEmpty(x, y)) {
                    board.addAnimal(new Rabbit(id++, x, y));
                    break;
                }
            }
        }

        return board;
    }
}
