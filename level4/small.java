import java.util.Scanner;

public class small {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //배열의 수 
        int B = sc.nextInt();// B보다 작은 값 찾기 

        int[] arr = new int[A];


        for(int i =0; i <A; i++){

            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < arr.length; j++){
            if(B > arr[j]){
                System.out.print(arr[j]+ " ");

        }
    

        }


    }
    
}
