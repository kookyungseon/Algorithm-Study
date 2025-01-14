import java.util.Scanner;

public class ball2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        int temp = 0;

        for(int i =0; i<N; i++){

            arr[i] = i+1;
        }
        for(int j = 0 ; j <M; j++){

            int I =sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;


        }
        for(int k=0; k<N; k++){
            System.out.print(arr[k]+" ");
        }
      

    }
    
}
// 5 4
// 1 2
// 3 4
// 1 4
// 2 2

// 바구니 N, 교환 횟수 M

// 5개의 바구니 [1 2 3 4 5]

// [2 1 3 4 5]
// [2 1 4 3 5]
// [3 1 4 2 5]
