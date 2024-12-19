import java.util.Scanner;


public class mul {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 472
        // 385
        System.out.println(a*(b%10)); // 385%10은 5이므로 472 *5가 됨
        System.out.println(a*((b%100)/10)); // 385*100 = 85, 85/10 = 8
        System.out.println(a*(b/100));// 385/100 =3
        System.out.println(a*b);


    }
    
}
