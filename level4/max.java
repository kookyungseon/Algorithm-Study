import java.util.Scanner;
import java.util.Arrays;

public class max {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i <N; i++){

            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);// arr 배열을 오름차순으로 정렬해준다
        System.out.println(arr[0] +" "+ arr[N-1]);
    }
    
}
