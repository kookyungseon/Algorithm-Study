import java.util.Scanner;


public class plusdiv {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        int C = sc.nextInt();

        for(int i = 0 ; i <C; i++){

            int A = sc.nextInt();
            int B = sc.nextInt();

            int num = i+1;
            int sum = A+B;

            System.out.println("Case #" + num + ": " + sum);
          

        }

    }
    
}
