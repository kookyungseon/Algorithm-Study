import java.util.Scanner;

public class receipt{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long total_price = sc.nextLong();
        int total_object = sc.nextInt();
        long cal_total =0;

  
        for(int i =0; i<total_object; i++){
            long price = sc.nextLong();
            int object = sc.nextInt();



            cal_total += price * object;

        }

        if(cal_total ==total_price){
            System.out.println("Yes");

        }else{
            System.out.println("No");

        }
  



    }

}