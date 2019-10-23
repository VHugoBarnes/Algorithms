package algorithm_introduction;

import algorithm_introduction.recursion.Recursion;

import java.util.Scanner;

public class AlgorithmIntroduction {

    public static void AlgorithmMenu() {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        Recursion recursion = new Recursion();

        int option = -1;

        System.out.println("Algorithm Introduction: ");
        System.out.println("1.- Queue.");
        System.out.println("2.- Basic Recursion.");

        option = scanner.nextInt();

        switch (option) {
            case 1:
                queue.menuQueue();
                break;
            case 2:
                recursion.recursionMenu();
        }

    }

}
