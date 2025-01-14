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

        //ex)5개의 배열,  20 10 35 30 7 -> 오름 차순 정렬 -> 7 10 20 30 35 -> arr[0]이 최소인 7, arr[n-1]은 (5-1)이므로 arr[4]인 35

        Arrays.sort(arr);// arr 배열을 오름차순으로 정렬해준다
        System.out.println(arr[0] +" "+ arr[N-1]); //arr[0] -> 최소 , arr[N-1] -> 최대
    }
    
}
