public class ExtendedFibonacci {
    public static void main(String[] args) {
        int n = 15;

        // Print the even numbers in the Fibonacci series from 1 to 15
        System.out.println("Even Fibonacci series from 1 to 15:");
        for (int i = 1; i <= n; i++) {
            int fibNumber = fibonacci(i);
            if (fibNumber % 2 == 0) {
                System.out.print(fibNumber + " ");
            }
        }
    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
