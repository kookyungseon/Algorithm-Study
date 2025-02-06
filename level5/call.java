import java.util.Scanner;


public class call {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();//wa

        int k = A.length(); //A의 길이 -> 2
        int count =0;


        for (int i =0; i < k; i++){

            switch (A.charAt(i)) { //"w" "i"
                case 'A':
                case 'B':
                case 'C':
                    count += 3;
                    
                    break;
                case 'D':
                case 'E':
                case 'F':
                count += 4;
                    break;
                    case 'G':
                    case 'H':
                    case 'I':
                    count += 5;
                        break;

                        case 'J':
                        case 'K':
                        case 'L':
                        count += 6;
                            break;
                            case 'M':
                            case 'N':
                            case 'O':
                            count += 7;
                                break;

                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                count += 8;
                                    break;

                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    
                                    count += 9;
                                        break;

                                        case 'W':
                                        case 'X':
                                        case 'Y':
                                        case 'Z':
                                        count += 10;
                                            break;
        
                
            
             
            }

        }
        System.out.println(count);


    }
    
}


// wa -> 10 + 3
// abc = 3
// def = 4
// ghi = 5
// jkl = 6
// mno = 7
// pqrs = 8
// tuv = 9
// wxyz = 10