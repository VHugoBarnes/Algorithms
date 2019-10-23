import algorithm_introduction.AlgorithmIntroduction;
import divide_and_conquer.DivideAndConquer;
import divide_and_conquer.MergeSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        mainMenu();

    }

    /**
     * The folowing topics will be covered in this Java program:
     *
     * 0.- Introduction to algorithms.
     * 1.- Searching and sorting.
     * 2.- Greedy Algorithms.
     * 3.- Dynamic programming.
     * 4.- Pattern Searching.
     * 5.- Divide and conquer.
     * 6.- Backtracking.
     * 7.- Geometric algorithms.
     * 8.- Mathematical algorithms.
     * 9.- Bit algorithms.
     * 10.- Graph algorithms.
     * 11.- Randomized Algorithms.
     * 12.- Branch and Bound.
     * */
    private static void mainMenu(){

        String answer = " ";
        Scanner s = new Scanner(System.in);

        do {
            int option = -1;

            System.out.println("Welcome boi, select the option you want:");
            System.out.println("0.- Introduction to algorithms.");
            System.out.println("1.- Searching and sorting.");
            System.out.println("2.- Greedy Algorithms.");
            System.out.println("3- Dynamic programming.");
            System.out.println("4.- Pattern Searching.");
            System.out.println("5.- Divide and conquer.");
            System.out.println("6.- Backtracking.");
            System.out.println("7.- Geometric algorithms.");
            System.out.println("8.- Mathematical algorithms.");
            System.out.println("9.- Graph algorithms.");
            System.out.println("10.- Graph algorithms.");
            System.out.println("11.- Randomized Algorithms.");
            System.out.println("12.- Branch and Bound.");

            option = s.nextInt();

            switch(option) {
                case 0:
                    AlgorithmIntroduction.AlgorithmMenu();
                    break;
                case 1:
                    auxErrorMessage();
                    break;
                case 2:
                    auxErrorMessage();
                    break;
                case 3:
                    auxErrorMessage();
                    break;
                case 4:
                    auxErrorMessage();
                    break;
                case 5:
                    auxErrorMessage();
                    break;
                case 6:
                    auxErrorMessage();
                    break;
                case 7:
                    auxErrorMessage();
                    break;
                case 8:
                    auxErrorMessage();
                    break;
                case 9:
                    auxErrorMessage();
                    break;
                case 10:
                    auxErrorMessage();
                    break;
                case 11:
                    auxErrorMessage();
                    break;
                case 12:
                    auxErrorMessage();
                    break;
            }

            System.out.println("Want another option? y/n");
            answer = s.next();

        } while (answer.equalsIgnoreCase("Y"));

    }

    private static void auxErrorMessage() {
        System.out.println("Oopsie Doopsie, this option is not available yet");
    }
}
