/******************************************************************************

 4). Write a program to find out a set of valid sub arrays from a given array. The window size of the sub array should be configurable.
 The output of each sub array should be formed by finding the maximum value in each position (i.e units, tens, hundreds, thousands position etc...).
 Example: If the sub array is (36,145,67,1004) then the biggest units place among these is 7,
 the biggest digit in tens place is 6 etc....
 So the derived number from this array would be 1167.
 A sub array is considered valid only if it has a favorite number in it. (the number can be in any position). The list of valid and invalid sub arrays should be printed at the end.
 Example Input
 Input Array: {35,145,67,1004,88,456,2034}
 Window size: 3
 Favorite number: 8
 Output:
 {35,145,67): 167
 (145,67,1004): 1167
 (67,1004,88): 1088
 (1004,88,456): 1488
 (88,456,2034): 2488
 Arrays (67,1004,88), {1004,88,456}, {88,456,2034) are valid arrays Arrays (35,145,67), (145,67,1004) are invalid arrays

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        int[] arr = {35,145,67,1004,88,456,2034};
        sliding_window(arr,arr.length,3,8);
    }

    static void sliding_window(int[] arr, int n, int k, int favorite){

        int test_position_value = Integer.MIN_VALUE;

        ArrayList<int[]> invalid = new ArrayList<>();
        ArrayList<int[]> valid = new ArrayList<>();
        if (arr.length < k) {
            System.out.println("Array length is less than the subarray size k");
            return;
        }
        
        for (int i = 0; i <= arr.length - k; i++) {
            int[] test_arr = printSubarray(arr, i, k);
            if(vaild_subarray(test_arr, favorite)){
                valid.add(test_arr);
                if(test_position_value < max_position_value(test_arr,k)){
                    test_position_value = max_position_value(test_arr,k);
                }
            }else{
                invalid.add(test_arr);
            }

        }

        System.out.println(test_position_value);
        for(int[] i: valid){
            System.out.print(Arrays.toString(i));
        }
        System.out.println();
        for(int[] i: invalid){
            System.out.print(Arrays.toString(i));
        }
    }



    private static int[] printSubarray(int[] arr, int start, int k) {
        int[] test_arr = new int[k];
        int p =0;
        for (int i = start; i < start + k; i++) {
            test_arr[p] = arr[i];
            p++;
        }
        return test_arr;
    }
    static boolean vaild_subarray(int[] sub_arr, int favorite){
        for(int i : sub_arr){
            if((i+"").contains(favorite+"")){
                return true;
            }
        }
        return false;

    }

    static int max_position_value(int[] sub_arr, int k){
        int maxlen = Integer.MIN_VALUE;
        for(int i: sub_arr){
            int digitLen = (int) Math.log10(i)+1;
            if( digitLen > maxlen){
                maxlen = digitLen;
            }
        }
        int[] Digitarr = new int[maxlen];
        for(int i: Digitarr){
            i= Integer.MIN_VALUE;
        }

        for(int i=0;i<k;i++){
            String str = ""+sub_arr[i];
            int len = str.length();
            for(int j=0;j<len;j++){
                if(Digitarr[j] < Integer.parseInt(str.charAt(len-j-1)+"")){
                    Digitarr[j] = Integer.parseInt(str.charAt(len-j-1)+"");
                }
            }
        }
        String result = "";
        for(int i=Digitarr.length-1;i>=0;i--){
            result+= Digitarr[i];
        }
        return Integer.parseInt(result);
    }
}
