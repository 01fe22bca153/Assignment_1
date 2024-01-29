import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum value for Fibonacci series: ");
        int max = scanner.nextInt();

        System.out.println("Fibonacci series up to " + max + ":");
        printFibonacciSeries(max);

        scanner.close();
    }

    public static void printFibonacciSeries(int max) {
        int first = 0, second = 1, next;

        while (first <= max) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
        }
    }
}
