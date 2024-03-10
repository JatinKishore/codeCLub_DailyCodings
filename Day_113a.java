/*Matrix Multiplication*/

import java.util.*;
public class Day_113a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2 [i][j] = sc.nextInt();
            }
        }

        //conditions
        if(c1!=r2){
            System.out.println("invalid");
            return;
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum =0;
                for(int k=0;k<c1;k++){
                    sum = sum + mat1[i][k]*mat2[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
