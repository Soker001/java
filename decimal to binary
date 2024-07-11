import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int decimalNumber = scanner.nextInt();
        String binaryString = Integer.toBinaryString(decimalNumber);
        String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();

        int reversedDecimalNumber = Integer.parseInt(reversedBinaryString, 2);
        System.out.println("Output: " + reversedDecimalNumber);

        scanner.close();
    }
}
