import java.util.*;
public class Day_117a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(evenlySpaced(a,b,c));
    }

    static  boolean evenlySpaced(int a, int b, int c){
        //min mid max
        int min = (a<b?a:b)>c?c:(a<b?a:b);
        int max = (a>b?a:b)<c?c:(a>b?a:b);
        int mid = a + b + c -(min + max);
        return mid-min == max-mid;
    }

}
