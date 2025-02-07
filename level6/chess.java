// 킹 퀸  룩 비숍 나이트 폰
// 0  1  2   2   2   7

// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
// 1 0 0 0 0 1


import java.util.Scanner;

public class chess{
    public  static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int resutl_K = 1;
        int resutl_Q = 1;
        int resutl_L = 2;
        int resutl_B = 2;
        int resutl_N = 2;
        int resutl_P = 8;

        int K = sc.nextInt();
        int Q = sc.nextInt();
        int L = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int P =sc.nextInt();

        resutl_K = (resutl_K  - K);
        resutl_Q = (resutl_Q  - Q);
        resutl_L = (resutl_L  - L);
        resutl_B = (resutl_B  - B);
        resutl_N = (resutl_N  - N);
        resutl_P = (resutl_P  - P);

   

        System.out.println(resutl_K + " " +resutl_Q + " " +resutl_L+" "+resutl_B +" "+resutl_N + " "+resutl_P);


    }
}