import java.util.Scanner;


public class basket {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M =sc.nextInt();

        // 5 4 입력받기 

        for(int a =0; a <N; a++){
            arr[a] = a+1;

            // 배열 [ 1 2 3 4 5]로 만들기 
            // System.out.print(arr[a]);
        }


        for(int i =0; i <M; i++){

            int I = sc.nextInt()-1; //배열을 arr[1]부터 제대로 작동하기 위함
            int J = sc.nextInt()-1;

          //바꿀곳 입력받기 
        //[ 1 2 3 4 5]

        // 2 1 3 4 5 
        // 2 1 4 3 5
        // 3 4 1 2 5


            // 1 2
              // 2 1 3 4 5 -> 왼쪽 오른쪽 바꿈
            // 3 4
            // 1 4
            // 2 2


            while(I < J){

                int temp = arr[J]; // temp에 2 저장하고
                arr[J]=arr[I]; // 2자리에 1 넣고
                arr[I] = temp;// 1자리에 저장한 temp 2값 넣음
                I++;
                J--;
            
            }
           
        }

        for(int i =0; i<N; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

