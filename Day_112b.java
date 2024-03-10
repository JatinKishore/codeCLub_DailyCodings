import java.util.*;
public class Day_112b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int result =-1;
        int product = 1;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                for(int k=i;k<=j;k++){
                    product*=arr[k];
                    result = product>result?product:result;
                }
                product=1;
            }
        }
        System.out.println(result);
    }
}
