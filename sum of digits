public class SumOfDigits {
    public static void main(String[] args) {
        int number = 91; 
        while (number >= 10) {
            number = getSumOfDigits(number);
        }
        System.out.println("The sum of the digits: " + number);
    }

    public static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;       
        }
        return sum;
    }
}
