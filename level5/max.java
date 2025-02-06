import java.util.Scanner;



public class max {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        

        int A = sc.nextInt();
        int B = sc.nextInt();
        int output = 0;
        int output2 = 0;
        while(A> 0){
            int result = A %10;
            output = (output * 10) +result;
            A /=10;

        }  

        while(B> 0){
            int result2 = B %10;
            output2 = (output2 * 10) +result2;
            B /=10;

        }  



        if(output<output2){

            System.out.println(output2);
         
        }else{

            System.out.println(output);
         

        }

       
   
//734 893
//734 % 10 = 4 
// 0 * 10 +4 =4

// 743/10 = 73

// 73%10 =3 
// 4*10 +4 = 43

// 73/10 = 7

// 7%10 =7
// 43*10 + 7 = 437

//7340 % 10 = 
     
      
    }
    
}
