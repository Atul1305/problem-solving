package general;

/**
 * Problem Link : https://www.geeksforgeeks.org/videos/java-program-to-check-duck-number/?utm_source=geeksforgeeks&utm_medium=article_video_tab&utm_campaign=article_video_tab
 * @since 05/02/2023
 */
public class DuckNumber {

    public static void main(String[] args) {
        System.out.println(checkDuckNumber(12309));
    }

    private static boolean checkDuckNumber(int n) {
        int r = -1;
        while(n>0) {
            r = n%10;
            n = n/10;

            if(r == 0 ) {
                return true;
            }
        }

        return false;
    }
}
