import java.util.*;
public class Day_111a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if((arr[i] + arr[j] + arr[k] == 0)){
                        String str = ""+arr[i]+" "+arr[j]+" "+arr[k];
                        if(!al.contains(str)){
                            al.add(str);
                            System.out.println(str);
                        }
                    }
                }
            }
        }
    }
}
