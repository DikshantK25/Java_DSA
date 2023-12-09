
import java.util.Scanner;

public class ArmstrongNumbersBetweenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = input.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();

        System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are:");

        for (int num = lowerLimit; num <= upperLimit; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }

        input.close();
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;


        while (num > 0) {
            int digit = num % 10;
            sum +=digit*digit*digit;
            num /= 10;
        }

        return sum == originalNum;
    }
}
