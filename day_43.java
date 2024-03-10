/*Minimize the maximum difference between the heights
Read
Courses
Practice
Jobs
Given the heights of N towers and a value of K, Either increase or decrease the height of every tower by K (only once) where K > 0. After modifications,
the task is to minimize the difference between the heights of the longest and the shortest tower and output its difference.

Examples:

Input: arr[] = {1, 15, 10}, k = 6
Output:  Maximum difference is 5.
Explanation: Change 1 to 7, 15 to 9 and 10 to 4. Maximum difference is 5 (between 4 and 9). We can’t get a lower difference.

Input: arr[] = {1, 5, 15, 10}, k = 3
Output: Maximum difference is 8, arr[] = {4, 8, 12, 7}

*/
import java.util.*;
public class day_43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);

        int i = 0;
        while(i<arr.length/2){
            arr[i] = arr[i] + k;
            i++;
        }
        while(i<arr.length){
            arr[i] = arr[i] -k;
            i++;
        }
        Arrays.sort(arr);

        System.out.println(arr[N-1] - arr[0]);
    }
}
