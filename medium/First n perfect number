public class PerfectNumberFinder {
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int N = 3;
        int count = 0;
        int num = 2;
        System.out.print("First " + N + " perfect numbers are: ");
        while (count < N) {
            if (isPerfectNumber(num)) {
                System.out.print(num);
                count++;
                if (count < N) {
                    System.out.print(" , ");
                }
            }
            num++;
        }
        System.out.println();
    }
}
