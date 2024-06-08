package string;

/*
 * Link -> https://www.geeksforgeeks.org/backtracking-to-find-all-subsets/
 * @since 05/06/2024
 * Solution : Correct
 *
 */


public class StringAOnStringB {
    private static boolean moved = false;

    private static char[] moveLeft(String A, String B) {
        char[] charA = A.toCharArray();
        char[] newCharA = new char[A.length()];
        int index = -1;

        for(int i=0; i < charA.length;i++) {
            if(charA[i] == B.charAt(0)) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            return null;
        }
        if(index != 0) {
            moved = true;
        }

        int newIndex = 0;
        for(int i = index; i<charA.length; i++) {
            newCharA[newIndex] = charA[i];
            newIndex++;
        }
        for(int i = 0; i<index; i++) {
            newCharA[newIndex] = charA[i];
            newIndex++;
        }

        return newCharA;
    }

    private static int overlap(char[] A, char[] B) {
        int count = 1;
        int indexA = 0;
        for(int i = 0; i<B.length; i++) {
            if (indexA == A.length){
                count++;
                indexA = 0;
            }
            if(A[indexA] != B[i]){
                return -1;
            } else {
                indexA++;
            }
        }
        return count;
    }

    // Driver code
    public static void main(String[] args) {
        // String A = "abc"; String B = "cabca";
        // String A = "abcd"; String B = "cdabcdab";
        String A = "xyz"; String B = "xzyxz";
        // String A = "abc"; String B = "";
        // String A = ""; String B = "";
        // String A = ""; String B = "ab";
        // String A = "a"; String B = "b";

        int res = -1;
        if(A == "") {
            res = -1;
        } else if(B == "") {
            res = 1;
        } else {
            char[] newA = moveLeft(A, B);
            if (newA == null) {
                res = -1;
            } else {
                res = overlap(newA, B.toCharArray());
            }
            if (moved && res * A.length() >= B.length()) {
                res++;
            }
        }

        System.out.println("Response : " + res);
    }
}
