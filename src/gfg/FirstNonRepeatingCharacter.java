/*
 *
 * Link -> https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
 * @since Apr 24th, 2024
 * Given a string S consisting of lowercase Latin Letters, the task is to find the first non-repeating
 * character in S.
 *
 * Input: “geeksforgeeks”
 * Output: f
 *
 * */
package gfg;

import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "algorithm";
        Map<Character, Integer> map = new TreeMap<>();

        for(int i=0; i<input.length(); i++){
           if (map.get(input.charAt(i)) == null) {
               map.put(input.charAt(i), 1);
           } else {
               map.compute(input.charAt(i), (k, count) -> count + 1);
           }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
               System.out.println(entry.getKey());
               break;
            }
        }
    }
}
