import java.util.*;

public class P1_2_CheckPermutation{
    //Problem: Given two strings, write a method to decide 
    //if one is a permutation of the other
    public static void main(String[] args) {
       System.out.println(isPermutatedSort("abcdefg", "abcdegf"));
       System.out.println(isPermutatedCount("abc", "cba"));
    }

    // Sorting way //
    static boolean isPermutatedSort(String s1, String s2) {
        // 
        
        if(s1.length() != s2.length()) return false;
        return sortStr(s1).equals(sortStr(s2));
    } 
    static String sortStr(String str){
        char[] strArray = str.toCharArray(); // O(n)
        Arrays.sort(strArray); //O(nlogn)
        return new String(strArray);
    }

    // Identical Character counts
    static boolean isPermutatedCount(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        
        int[] characters = new int[128];
        char[] s1Array = s1.toCharArray();
        
        for (char c1: s1Array){
            characters[c1]++;
        }
        
        for (int i = 0; i < s2.length(); i++){
            int c2 = (int) s2.charAt(i);
            characters[c2]--;
            if(characters[c2] < 0) return false;
        }
        return true;
    }
}