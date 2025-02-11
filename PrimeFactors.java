import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to find its prime factors: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + " are:");
        findPrimeFactors(number);

        scanner.close();
    }

    // Method to find and print prime factors
    public static void findPrimeFactors(int num) {
        // Handle factor of 2
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
    

        // Handle odd factors
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i; 
            }
        }

        // If num is still greater than 2, it must be prime
        if (num > 2) {
            System.out.print(num);
        }
    }
}