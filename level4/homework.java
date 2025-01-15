import java.util.Scanner;

public class homework {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
   
        // int[] arr = new int[N];
        int[] arr = new int[31]; // 배열 1-30까지의 배열 
      

        for(int i=0; i <28; i++){ // 28개의 숫자 입력받기 

            int A = sc.nextInt();
            arr[A] = 1; //배열에 존재하면 1로 표시 

      
        }
        for(int j =1; j<arr.length; j++){ // 배열의 길이 만큼 반복해서 확인하기 


            if(arr[j] != 1){ // 배열에 존재하지 않으면 
                System.out.println(j);//프린트 하기 
            }

        }
        
    }
    





}
