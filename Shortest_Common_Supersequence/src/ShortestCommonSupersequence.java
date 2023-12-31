public class ShortestCommonSupersequence {
    public static int shortestCommon(String X,String Y,int m,int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (X.charAt(i - 1) == Y.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String X = "abcd", Y = "xycd";
        System.out.println(shortestCommon(X,Y,X.length(),Y.length()));
    }
}
