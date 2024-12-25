import java.util.Scanner;

public class plus2 {
    
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int sum =0;

        for(int i =1 ; i <= A; i++){

            //3이면 1 + 2 + 3
            //i + i + i...

            sum += i;
           

        }
        System.out.println(sum);
        

    }
}
