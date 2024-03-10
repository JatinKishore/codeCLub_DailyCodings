import java.util.*;
public class Day_110a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k =0;
        while(!sorted(arr)){
            rotator(arr);
            k++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(k);
    }

    static boolean sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return  false;
            }
        }
        return true;
    }

    static  void rotator(int[] arr){
        int temp =   arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-2] =   temp;
    }


}
