/**
 * Created by ramalina on 3/13/18.
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubString {

    public static void main(String[] args) {

        String inputString = "ffgfkkjkhgvvvjvjffuf";
        String longestSubstring = "";
        String temp = "";
        int i = 0;
        while(i < inputString.length()) {
            for(int j = i; j <inputString.length(); j++){
                String sub = Character.toString(inputString.charAt(j));
                if (temp.contains(sub)){
                    i = i+1;
                    temp = "";
                    break;
                }
                temp = temp + sub;
                if (longestSubstring.length() < temp.length()) {
                    longestSubstring = temp;
                }
            }

        }

        System.out.println("LONGEST is " + longestSubstring + " with length of " + longestSubstring.length());
    }
}

