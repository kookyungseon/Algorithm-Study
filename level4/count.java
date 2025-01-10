// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
// 입력
// 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 
// 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
// 출력
// 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

// 예제 입력 1 
// 11
// 1 4 1 2 4 2 4 2 3 4 4
// 2

// 예제 출력 1 
// 3

import java.util.Scanner;



public class count {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int count = 0 ;
        int N = sc.nextInt();//첫번째 줄 -> 입력 받을 배열의 길이 
        int[] arr = new int[N]; // 배열생성 -> 길이는 N만큼

        for(int i= 0; i <N; i++){
            arr[i] = sc.nextInt();
        }//입력한 길의 만큼 배열에 들어갈 값 입력하기 

        int v = sc.nextInt(); // 세번째줄 -> 찾으려고 하는 정수

        for(int j = 0; j< arr.length; j++) {//배열의 길이 만큼 반복
            if(v == arr[j]){ //v가 배열에 존재하면 
                count++;//카운트 증가 
            }

        }

        System.out.println(count);









    }
    
}
