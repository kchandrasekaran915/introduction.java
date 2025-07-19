import java.util.Scanner;

public class DiscountCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the purchase amount
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double discount = 0;
        double finalAmount;

        // Apply discount based on purchase amount
        if (purchaseAmount < 500) {
            discount = 0;  // No discount
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = purchaseAmount * 0.10;  // 10% discount
        } else if (purchaseAmount > 1000) {
            discount = purchaseAmount * 0.20;  // 20% discount
        }

        // Calculate final amount
        finalAmount = purchaseAmount - discount;

        // Display results
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);

        scanner.close();
    }
}

