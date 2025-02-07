import java.util.Scanner;

public class star {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1; i <=num ; i ++){
            //num = 5
   

           // i = 1, 2,3, 4, 5,
            for(int j =1; j <= num-i; j++){
//i =1 j= 4
               System.out.print(" ");

             }for(int j=1; j <=i*2-1; j++){
                System.out.print("*");
                // i =1 j = 1

             } System.out.print("\n");
               
        }

        for(int i = num-1; i>=1; i--){

            for(int j = 1; j<=num-i ; j++){
                System.out.print(" ");
            }for(int j = 1; j<=i*2-1; j++){
                System.out.print("*");
            }System.out.print("\n");

        }


    }
    
}
// 5
//     *  띄어쓰기 4번 
//    *** 띄어쓰기 3번
//   ***** 띄어쓰기 2번
//  ******* 1
// ********* 0
//  ******* 1 7 1x31
//   ***** 2 5 2x
//    *** 3 3
//     * 4 1