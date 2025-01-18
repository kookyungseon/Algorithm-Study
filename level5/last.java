import java.util.Scanner;

public class last {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        for(int i =0; i <count; i++){

            String word = sc.nextLine();

            System.out.print(word.charAt(0));
            System.out.println(word.charAt(word.length()-1));

            

        


        }
        
    }
    
}
