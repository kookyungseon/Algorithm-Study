import java.util.Scanner;

public class ball {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //바구니 수
        int[] arr = new int[N];

        int M = sc.nextInt(); // 공의 수 

        for(int i =0; i<M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K =sc.nextInt();
  // i번 바구니 부터 j번 바구니까지 공을 K번 넣는다
            for(int x = I-1; x < J; x++ ){

                arr[x] = K;

            }


        }
        for(int y = 0; y < N; y++){
            System.out.print(arr[y] + " ");
        }
  


        //N = 5, M =4
        // [0 0 0 0 0]
        //1 2 3
        // 1번 바구니부터 2번 바구니까지 공을 3번 넣는다
        //[3 3 0 0 0]
        // 3 4 4 -> 3번 바구니부터 4번 바구니까지 공을 4번 넣는다
        // [3 3 4 4 0]
        // 1 4 1
        // [1 1 1 1 0]
        // 2 2 2 
        // [1 2 1 1 0]
     


    }
    
}
