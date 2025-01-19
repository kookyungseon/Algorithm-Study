import java.util.Scanner;

public class word {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
   
        int N = sc.nextInt()-1;

        System.out.print(word.charAt(N));

        //word.charAt(N)은 word에 저장된 단어의 N번째 문자 출력
    }
    
}
