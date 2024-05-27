/******************************************************************************
Video Solution Link : https://youtu.be/bX9Ni5SFzgE
PASCAL's Triangle
input:
5

output:
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

 *******************************************************************************/
public class Day_153
{
    public static void main(String[] args) {
        int N = 5;
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=(N-i-1);j++){
                System.out.print(binomialCoefficent(N-i-1,j)+" "); // N=5, i=4, j=0 ;  N-i-1 -> 0,
            }
            System.out.println();
        }

        System.out.print(binomialCoefficent(3,1));
    }
    static  int binomialCoefficent(int n, int k){
        int N_Fact =1;
        int K_Fact = 1;
        int N_K_Fact =1;
        int N_K = n-k;

        while(n!=0){
            N_Fact = N_Fact*n;
            n--;
        }
        while(k!=0){
            K_Fact = K_Fact*k;
            k--;
        }
        while(N_K!=0){
            N_K_Fact = N_K_Fact*N_K;
            N_K--;
        }
        int result = N_Fact/(K_Fact*N_K_Fact);
        return  result;

    }
}
