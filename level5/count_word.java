import java.util.Scanner;
import java.util.StringTokenizer;

public class count_word {

    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        
        StringTokenizer st  = new StringTokenizer(word, " ");//공백을 기준으로 나누어 토큰을 저장한다. 

        System.out.println(st.countTokens());

        
    }
}