import java.util.Scanner;
import java.lang.Math;

public class dice {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();



      
// A = B
// A = C
// B = C

        if(A==B && B==C){

            System.out.println(10000 + (A*1000));

        }else if(A == B && A != C ){
            System.out.println(1000 + (A*100));

        }else if (A == C && A !=B ){
            System.out.println(1000 + (A*100));
        }else if (B == C && A !=B ){
            System.out.println(1000 + (B*100));

        }else{ 
            int max = Math.max(A, Math.max(B, C)); // 이 부분 중요!!!!

            System.out.println(max * 100);
        }
    }
    
}
