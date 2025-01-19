import java.util.Scanner;
public class test {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum =0;

        for(int i =0; i<N; i++){

            int M = sc.nextInt();
            sum += M;

        }
        System.out.println(sum);
       
    }
    
}
