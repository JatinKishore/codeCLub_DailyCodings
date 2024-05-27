
/*
Input:
XMJYAUZ
XMJAATZ

Output:
X M J -Y A -U +A +T Z

*/
import java.util.Scanner;

public class Day_151{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String Y = sc.next();
        int Xlen = X.length();
        int Ylen = Y.length();
        int i=0;int j=0;
        while(i!=Xlen && j!=Ylen){
            if(X.charAt(i) == Y.charAt(j)){
                System.out.print(X.charAt(i)+" ");
                i++;
                j++;
            }
            else if(X.charAt(i) != Y.charAt(j) && i<Xlen){
                System.out.print("-" + X.charAt(i)+" ");
                i++;
            }
            if(i== Xlen-1){
                int count =0;
                while(j<Ylen){
                        if(Y.charAt(j) == X.charAt(i) && count<1){
                            System.out.print(Y.charAt(j)+" ");
                            count++;
                            j++;
                        }
                        else{
                            System.out.print("+"+Y.charAt(j)+" ");
                            j++;
                        }
                }
                if(count==0){
                    System.out.print("-"+X.charAt(i)+" ");
                }
            }

        }
    }
}
