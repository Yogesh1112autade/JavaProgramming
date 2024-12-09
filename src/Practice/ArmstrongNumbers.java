package Practice;
public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are:");
        
        // Loop through numbers from 1 to 999
        for (int number = 1; number < 1000; number++) {
            int originalNumber = number;
            int sum = 0;
            int digits = String.valueOf(number).length();  // Get the number of digits in the number

            // Calculate the sum of digits raised to the power of the number of digits
            while (number > 0) {
                int digit = number % 10;  // Get the last digit
                sum += Math.pow(digit, digits);  // Add digit^digits to the sum
                number /= 10;  // Remove the last digit
            }

            // If the sum is equal to the original number, it's an Armstrong number
            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}
