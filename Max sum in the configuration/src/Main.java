public class Main {
    public static long max_sum(int[] a, int n) {
        long sum = 0;
        for (int i = 0; i < n; ++i) sum += a[i];
        long currSum = 0;
        for (int i = 0; i < n; ++i) currSum += (long)i * a[i];
        long maxi = currSum;
        for (int i = 1; i < n; ++i) {
            currSum = currSum + sum - (long)n * a[n - i];
            maxi = Math.max(maxi, currSum);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int n = 4;
        int[] a = {8, 3, 1, 2};
        System.out.println(max_sum(a,n));
    }
}