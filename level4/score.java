import java.util.Scanner;

public class score {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int subject = sc.nextInt();
        int[] arr = new int[subject]; 
        double max = arr[0];
        double avg;
        double sum =0;
        

        for(int i = 0; i<subject; i++){

            int score = sc.nextInt();

            arr[i] =score;

    
        }
        for(int j = 0; j<arr.length; j++){

      
            if(arr[j]>max){
                max = arr[j];
            }
          
        }

        for(int k =0; k<subject; k++){

            avg = arr[k]/max*100;
            sum += avg;

        }

        double newavg = sum/subject;

        System.out.print(newavg);

    



        // for(int i = 0; i<subject; i++){
        //     System.out.print(arr[i]);

        // }
   
    }
    
}


// for(int a =0; a <N; a++){
//     arr[a] = a+1;

//     // 배열 [ 1 2 3 4 5]로 만들기 
//     // System.out.print(arr[a]);
// }


// 3
// 40 80 60

