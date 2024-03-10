import java.lang.reflect.Array;
import java.util.*;
public class Day_109c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();


        int diff = Integer.MAX_VALUE;
        int[] Result_pair = new int[2];
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--){
                int i1 = x - (arr[i] + arr[j]);
                i1 = i1<0?i1*-1:i1;
                if(i1<diff && i!=j){
                    diff = i1;
                    Result_pair[0] = arr[i];
                    Result_pair[1] = arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(Result_pair));

    }
}
