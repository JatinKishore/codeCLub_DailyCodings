import java.util.*;
public class Day_111b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int window = 1;
        int sum = 0;
        int count=0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                for(int k=i;k<=j;k++){
                    sum^=arr[k];
                }
                if(sum==B){
                    count++;
                }
                sum=0;
            }
        }
        System.out.println(count);
    }
}
