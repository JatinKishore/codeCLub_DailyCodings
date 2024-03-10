import java.util.Scanner;

public class Day_116a{
    public static void main(String[] args) {
        int r, unit, n, food, houses, count;
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt(); //getting number of rats from user
        unit = scanner.nextInt(); //number of units
        n = scanner.nextInt();
        int arr[] = {2, 8, 3, 5, 7, 4, 1, 2};

        if (arr == null){
            System.out.println(-1);
            return;
        }else{
            for(int i = 0; i < n; i++){
                houses = arr[i]; //houses = 18
                count = 1; //4
                for(int j = i + 1; j < n; j++){
                    if (houses >= (r * unit)){ // r * unit = 14
                        System.out.println(count);
                        return;
                    }else{
                        houses += arr[j]; // houses = 13 + 5 = 18
                        count++;
                    }
                }
            }
        }
        System.out.println(0);
        return;
    }
}
