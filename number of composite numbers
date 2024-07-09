public class CompositeNumbers {
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        System.out.println("Number of Composite Numbers = " + countCompositeNumbers(arr));
        int[][] testCases = {
            {26, 28, 37, 26, 33, 31, 29},
            {0, 160, 180, 270, 160, 230, 210, 190, 0},
            {200, 180, 180, 270, 270, 270, 190, 200},
            {100, 100, 100, 100, 100, 100, 100, 100}
        };
        for (int[] testCase : testCases) {
            System.out.println("\nArray: " + java.util.Arrays.toString(testCase));
            System.out.println("Number of Composite Numbers = " + countCompositeNumbers(testCase));
        }
    }
    public static int countCompositeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isComposite(int num) {
        if (num < 2) {
            return false;
        }
        int divisorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }
        return divisorCount > 2;
    }
}
