import java.util.Scanner;

public class sum {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

   

        int N = sc.nextInt();
        sc.nextLine(); 
        int sum = 0;


            String A = sc.nextLine();

            for(int j =0; j<A.length(); j++){
                sum += A.charAt(j)-'0';
                //'0'은 문자 '0'의 아스키 코드 값
                //'5'에서 문자 '0'을 빼념 53-48 = 5
                //즉, 숫자로 변환해준다


            }
        
            System.out.println(sum);

            
        }
    }
    
