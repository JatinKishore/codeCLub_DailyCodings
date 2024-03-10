import java.util.*;
public class Day_109a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int[] arr = new int[N];

        int result = -1;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--){
                if(arr[i]<=arr[j]){
                    if((j-i)>result){
                        result = j-i;
                    }
                }
            }

        }
        System.out.println(result);
    }


}
