package bishi0523;

import java.util.*;
public class Test1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n+1];
        for(int i = 1; i < n+1;i++){
            nums[i] = in.nextInt();
        }
        int[][] dp = new int[n+1][40+1];
        for(int i =0;i<n+1;i++){
            dp[i][0] = 1;
        }
        for(int i = 1;i<n+1;i++){
            for(int j =0;j<41;j++){
                if(nums[i] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i]];
                }else{
                    dp[i][j] = dp[i][j];
                }
            }
        }
        System.out.println(dp[n][40]);
    }
}