import java.util.*;
public class Day_110b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k=0;
        int l =0;
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();
        }
    }
}
