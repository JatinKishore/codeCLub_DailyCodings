import java.util.*;

import static java.util.Collections.swap;

public class Day_109b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] =sc.nextInt();
        }
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<N;j++){
            if(arr[j] != (j+1)){
                System.out.println("Missing Number ="+ (j+1));
                System.out.println("Repeating Number ="+ arr[j]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] arr, int value, int correct){
        arr[value] = arr[value] + arr[correct] - (arr[correct] = arr[value]);
    }

}
