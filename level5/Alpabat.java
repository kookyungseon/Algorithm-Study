import java.util.Scanner;
import java.util.Arrays;


public class Alpabat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int arr[] = new int[26]; //알파벳이 들어있는 배열 만들기
        Arrays.fill(arr, -1); // 배열을 모두 -1로 설정하기 

        for(int i =0; i < word.length(); i++){ //알파벳을 돌면서 처리
            //이때, i는 현재 인덱스 값
            //[a b c d e]
            //charAt(0)이면 a
            char ch = word.charAt(i);//
     

                if(arr[ch-'a']==-1){//아직 한번도 등장하지 않았다면
                    arr[ch-'a'] = i;//등장했다고 인덱스 값에 표시 

                }
               
        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


    }
    
}
