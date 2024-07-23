import java.util.Scanner;

public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = new int[4];
        int[] counts = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "st Denomination: ");
            denominations[i] = scanner.nextInt();
            System.out.print("Enter the " + (i + 1) + "st Denomination number of notes: ");
            counts[i] = scanner.nextInt();
        }

        int totalBalance = 0;
        for (int i = 0; i < 4; i++) {
            totalBalance += denominations[i] * counts[i];
        }
        System.out.println("Total Available Balance in ATM: " + totalBalance);
        scanner.close();
    }
}
