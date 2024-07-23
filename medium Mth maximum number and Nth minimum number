import java.util.Arrays;

public class MaxMinFinder {
    public static void findMaxMin(int[] array, int M, int N) {
        Arrays.sort(array);
        int MthMax = array[array.length - M];
        int NthMin = array[N - 1];
        int sum = MthMax + NthMin;
        int difference = MthMax - NthMin;
        System.out.println(M + "th Maximum Number = " + MthMax);
        System.out.println(N + "th Minimum Number = " + NthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
    public static void main(String[] args) {
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        int M = 1;
        int N = 3;
        findMaxMin(array, M, N);
    }
}
