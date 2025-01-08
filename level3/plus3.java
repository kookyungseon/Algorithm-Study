import java.util.Scanner;

public class plus3 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for(int i=0; i < c; i++ ){

            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println("Case #"+ (i+1)+ ": " + A + " + " + B + " = " + (A+B));


        }
    }
    
}
