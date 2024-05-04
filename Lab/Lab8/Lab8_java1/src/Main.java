import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        for(int i=0; i<=amount; i++){
            dp[i] = amount+1;
        }

        dp[0] = 0;

        for(int i=0; i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                int c = coins[j];
                if(i-c >= 0){
                    dp[i]= dp[i-c]+1;
                }
            }
        }

        if(dp[amount]>amount){
            return -1;
        }
        else{
            return dp[amount];
        }

    }

    public static void main(String[] args) {

        int[] a = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(a,amount));



    }


}