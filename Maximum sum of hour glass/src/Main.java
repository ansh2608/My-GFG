public class Main {
    public static int findMaxSum(int n, int m, int[][] mat) {
        if(n<=2 || m<=2)return -1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                int sum=mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }
}