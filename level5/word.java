import java.util.Scanner;

public class word {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
   
        int N = sc.nextInt()-1;

        System.out.print(word.charAt(N));
    }
    
}
