import java.util.*;
public class Day_113b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr =  new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int j =0;
        for(int i=0;i<M;i++){
            if(i%2==0){
                while(j!=N){
                    System.out.print(arr[j][i]+" ");
                    j++;
                }
                j--;
            }else{
                while(j!=-1){
                    System.out.print(arr[j][i]+" ");
                    j--;
                }
                j++;

            }
        }

    }
}
