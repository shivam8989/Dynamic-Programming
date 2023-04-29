package Dynamic_Programming;

public class Tabulation {
    public static int fibtab(int n , int dp[]){
        dp[0] = 0;
        dp[1] = 1;
        int ans = 0;
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
            ans = dp[i];
        }
        return ans;

    }
    public static void main(String args[]){
        int n = 5;
        int dp [] = new int[n+1];
        System.out.println(fibtab(n,dp));
    }
}
