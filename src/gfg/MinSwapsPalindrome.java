// JAVA program to Count
// minimum swap to make
// string palindrome
package gfg;

class MinSwapsPalindrome {

    private static int countSwaps(char[] arr, int x, int y){
        int swapCount = 0;
        if(x>=y) {
            return -1;
        }

        for(int i=x; i<y; i++){
            swap(arr, i, i+1);
            swapCount++;
        }

        return swapCount;
    }

    private static void swap(char[] arr, int x, int y){
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static int countSwaps(String str){
        int minSwaps = 0;
        char[] arr = str.toCharArray();

        for(int i=0, j=arr.length-1; i<j; i++){
            if(arr[i] == arr[j]) {
                i++;
                j--;
                continue;
            } else {
                int a = i;
                int b = j-1;

                while (a<b){
                    if(arr[a] == arr[b]) {
                        minSwaps = minSwaps + countSwaps(arr, b, j);
                        j = b-1;
                        break;
                    }
                    b--;
                }
                if(a>=b) {
                    return -1;
                }
            }
        }

        return minSwaps;
    }



    public static void main(String[] args) {
        System.out.println(countSwaps("aaba"));
    }
}