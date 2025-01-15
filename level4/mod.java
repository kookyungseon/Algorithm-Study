import java.util.Scanner;

public class mod {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);



        int count = 0;
        int[] arr = new int[10] ;


        for(int i =0 ; i <10; i++){

            int A = sc.nextInt();
         

            arr[i]= A %42;

     
            // System.out.println(arr[i]);

           int isUnique = 1;
         
            for(int j =0; j <i; j++){

    


            if(arr[j] == arr[i]){
                isUnique = 0;
                break;

             
               }
            

    
            }
          
            if(isUnique==1){
                count++;

               }

        
        }
         System.out.println(count);


  






    }
    
}
