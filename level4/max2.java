import java.util.Scanner;


public class max2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = arr[0]; // 최대값
        int index = 0; //최대값의 위치 

        for(int i =0; i < arr.length; i++ ){
            arr[i] =sc.nextInt();
            
            if(max < arr[i]){ //arr에서 입력받은 값이 현재의 값보다 크면 max값 갱신, 인덱스값의 +1
                max = arr[i];
                index = i+1;
            }
      

              //ex)3
                // 29
                // 38
                // 12
                // 57
                // 74
                // 40
                // 85
                // 61
                //이면 처음에 3을 max에 저장 -> index =0
                //29를 입력받으면 3과 29를 비교 29가 더 크므로 max값을 29로 갱신 index+1 = 1
                //38>29 이므로 max는 38, index+1 = 2
                //12<38 이므로 max, index유지 
                //57>38이므로 max 값 57, index = 4+1 =5
                //74>57 max 값 74, index = 5+1 =6
                //40<74 max, index 유지.... 

        }
        System.out.println(max);
        System.out.println(index);

    }
    
}
