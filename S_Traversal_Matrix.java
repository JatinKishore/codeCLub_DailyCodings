import java.util.*;
public class S_Traversal_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            if(i%2==0){
                for(int j=0;j<M;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=M-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
