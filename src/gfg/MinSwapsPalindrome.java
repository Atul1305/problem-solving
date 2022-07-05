// JAVA program to Count
// minimum swap to make
// string palindrome
package gfg;

class MinSwapsPalindrome {

    private static void swap(char[] arr, int x, int y){
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static int countSwaps(char[] arr, int x, int y){
        int swapCount = 0;
        if(x >= y) {
            return -1;
        }

        for(int i=x; i<y; i++){
            swap(arr, i, i+1);
            swapCount++;
        }

        return swapCount;
    }

    private static int countSwaps(String str){
        int minSwaps = 0;
        char[] arr = str.toCharArray();

        for(int i=0, j=arr.length-1; i<j; ){
            boolean bothPointersSame = arr[i] == arr[j];
            if(bothPointersSame) {
                i++;
                j--;
                continue;
            } else {
                int a = i;
                int b = j;

                while (a < b){
                    if(arr[a] == arr[b]) {
                        minSwaps = minSwaps + countSwaps(arr, b, j);
                        j = b-1;
                        break;
                    } else {
                        b--;
                    }
                }
                if(a >= b) {
                    return -1;
                }
            }
        }
        return minSwaps;
    }

    private static int min(int count, int reverseCount) {

        if( count == -1 && reverseCount == -1 )
            return -1;
        else if (reverseCount == -1 && count > 0)
            return count;
        else if (count == -1 && reverseCount > 0)
            return reverseCount;
        else {
            if (reverseCount < count)
                return reverseCount;
            else
                return count;
        }
    }

    public static void main(String[] args) {
        // System.out.println( "aab -> " + countSwaps("aab"));
        // System.out.println("aaba -> " + countSwaps("aaba"));
        // System.out.println("aabaa -> " + countSwaps("aabaa"));
        String str = "bananaa";
        int count = countSwaps(str);
        System.out.println("count -> " + count);

        String reverseStr = new StringBuilder(str).reverse().toString();
        int reverseCount = countSwaps(reverseStr);
        System.out.println("reverseCount -> " + reverseCount);

        System.out.println("Min Swap Count : " + min(count, reverseCount));
    }
}