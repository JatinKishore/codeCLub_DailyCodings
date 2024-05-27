/*
Rotate Image
 Amazon/ Apple/ Adobe/ Google
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

*/
import java.util.Scanner;

public class Day_149{
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

        for(int i=0;i<M;i++){
            for(int j=N-1;j>=0;j--){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
