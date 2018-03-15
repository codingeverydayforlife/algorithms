import java.util.HashMap;

/**
 * Created by ramalina on 3/14/18.
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * Example 1:
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 */

public class JewelsAndStones {
   public static void main(String[] args) {
       String j = "aAc";
       String s = "aAAbbbbcccccdddd";
       HashMap<Character,Integer> countMap = new HashMap<>();
       int count = 0;
       for(int i =0; i < s.length(); i ++) {
           if(j.contains(Character.toString(s.charAt(i)))){
               count++;
           }
       }
       System.out.println(count);

   }
}
