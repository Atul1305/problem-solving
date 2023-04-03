package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
* Link -> 3. Longest Substring Without Repeating Characters.
* @since Apr 2nd, 2023
*
* Algo -
*
 */
public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring(""));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] charArr = s.toCharArray();
        int maxSubStringLen = 0;
        if(s.length() == 1) {
            return 1;
        }
        for(int i=0; i<charArr.length; i++) {
            Set<Character> characterSet = new HashSet<>();
            characterSet.add(charArr[i]);
            int tmpSubStringLen = 1;
            for(int j=i+1; j<charArr.length; j++) {
                if(characterSet.add(charArr[j])) {
                    tmpSubStringLen++;
                } else {
                    break;
                }
            }
            if(tmpSubStringLen > maxSubStringLen) {
                maxSubStringLen = tmpSubStringLen;
            }
        }
        return maxSubStringLen;
    }
}
