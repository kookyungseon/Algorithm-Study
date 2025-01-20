import java.util.Scanner;


public class repeat {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();//2
        for(int i =0; i< num; i++){//테스트 케이스 2개

            int N = sc.nextInt();// 3
            String word = sc.next();//ABC
          

            for(int j = 0; j<word.length(); j++){//단어의 길이 만큼 반복하기 ABC
                for(int k =0; k<N; k++){// ABC 3번 반복
                   

                    System.out.print(word.charAt(j));

                }




            }
            System.out.println(); // 각 테스트 케이스 끝에 줄바꿈 추가
        


        }
    }
    
}
// 예제 입력 1 
// 2
// 3 ABC
// 5 /HTP
// 예제 출력 1 
// AAABBBCCC
// /////HHHHHTTTTTPPPPP