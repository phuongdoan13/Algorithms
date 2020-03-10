
import java.util.*;
public class TripleStep8_1{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWaysBruteForce(n));
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        System.out.println(countWaysMem(n, memo));
    }

    public static int countWaysBruteForce(int n) {
        // O(3^n)
        if(n < 0)return 0; // could be 1 for n =0;
        else if(n == 0) return 1;
        else return countWaysBruteForce(n-1)+ countWaysBruteForce(n-2) + countWaysBruteForce(n-3);
    }
    
    public static int countWaysMem(int n, int[] memo) {
        // O 
        if(n < 0)
            return 0;
        else if(n ==0) 
            return 1; // could be 1 for n =0;
        else if(memo[n] != -1) 
            return memo[n];
        else{
            memo[n] = countWaysMem(n-1, memo) + countWaysMem(n-2, memo) + countWaysMem(n-3, memo);
            return memo[n];
        }
        
    }
    
}
