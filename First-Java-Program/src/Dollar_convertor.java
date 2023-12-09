import java.util.Scanner;

public class Dollar_convertor {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

         // Get the exchange rate (1 USD to X INR)
        System.out.print("Enter the current exchange rate (1 USD to X INR): ");
        double exchangeRate = sc.nextDouble();

        // Get the amount in INR to convert
        System.out.print("Enter the amount in Indian Rupees (INR): ");
        double amountInRupees = sc.nextDouble();

        // Calculate the amount in USD
        double amountInDollars = amountInRupees / exchangeRate;

        // Display the result
        System.out.println("Equivalent amount in US Dollars (USD): " + amountInDollars);


    }
}
