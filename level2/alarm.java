import java.util.Scanner;



public class alarm {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M>=45){
            System.out.println(H +" "+ (M-45));
           
        }else if(H>0 && M<45){
            System.out.println((H-1) + " " + (M+60-45) );
        }else if(H ==0 &&M<45){
            System.out.println((24-1) + " " +(M+60-45));
        }
    }
    
}
