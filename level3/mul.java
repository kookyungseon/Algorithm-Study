import java.util.Scanner;

public class mul{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A  = sc.nextInt();
        int i = 0;

        for(i=1; i<10; i++){
            System.out.println(A + " * " + i + " = " +(A*i));
        }

    }
}