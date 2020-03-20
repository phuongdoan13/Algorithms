public class P1_3_URLify{
    //Problem: Write a meethod to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at
    // the end to hold the additional characters, and that you are given the "true" length of the string. (Note: if implementing in Java
    // please use the character array)
    //Example: urlify("Mr John Smith    ", 13)
    //output:         "Mr%20John%20Smith"

    public static void main(String[] args) {
        System.out.println("Cheating method: " + urlify("Mr John Smith    ", 13));
    }

    //Cheating method using String array
    static String urlify(String s, int truelen){
        return String.join("%20",s.trim().split(" "));
    }

    
}