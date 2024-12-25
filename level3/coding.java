import java.util.Scanner;

public class coding {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int div = A/4;

        //A가 20 -> div =5

        for(int i =0; i< div; i++){

            System.out.print("long ");
        }
        System.out.print("int");

    }
    
}
