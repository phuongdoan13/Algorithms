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
    static String urlifyCheat(String s, int truelen){
        return String.join("%20",s.trim().split(" "));
    }

    static String urlify(String s, int truelen){
        char[] cArr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == ' '){
                cArr[i] = '%';
                cArr[i+1] = '2';
                cArr[i+2] = '0';
                i += 1; 
            }else{
                cArr[i] = currentChar;
            }
        }

        String str = new String(cArr);
        return str;
    }

    
}