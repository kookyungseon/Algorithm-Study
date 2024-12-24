import java.util.Scanner;

public class clock {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int plus = B + C;
            int zero = A+plus/60;
 


            if(B+C >=60 && zero < 24){

                System.out.println((A+plus/60) + " " + plus%60);
            }else if((zero)>=24){
                System.out.println( (zero-24) +" " +plus%60);
            }else{
                System.out.println(A + " " + plus);
            }  


        }
    
}

