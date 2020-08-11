import java.util.*;
public class P1_1_IsUnique{
    //Problem: Implemennt an algorithm to determine 
    //if a string has all unique charcters. 
    //What if you cannot use additional data structures?
    public static void main(String[] args) {
       System.out.println(isUnique("abcdefg"));
    }
    public static boolean isUnique(String s) {
        //O(n)
        boolean[] isUniqueChar = new boolean[128];
        Arrays.fill(isUniqueChar, true);
        for(int i = 0 ; i < s.length(); i++){
            int ascii = s.charAt(i);
            if(!isUniqueChar[ascii]) return false;
            else isUniqueChar[ascii] = false;
        }
        return true;
    } 
}