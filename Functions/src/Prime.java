import  java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            boolean isPrime = isPrime(number);

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }


        }

        // Static method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }


