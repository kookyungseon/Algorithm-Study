#include <stdio.h>
#include <math.h>

// //M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

int is_prime(int num){

    //소수가 아닌경우
    //1. 2보다 작은경우 소수가 아님
    //(2인경우는 소수임)
    //2. 2로 나눴을때 나머지가 0인경우 
    //3. 2부터 제곱근까지 범위 내에서 다른 숫자로 나누어 떨어지는 경우 

    if(num<2){
        return 0;
    }
    if(num==2){
        return 1;
    }
    
    if(num%2==0){
         return 0;
    }

    for(int i =3; i<=sqrt(num);i+=2 ){ //2는 이미 처리했으므로 3부터 시작 
    //i가 num의 제곱근보다 작거나 같을을때, i를 2씩 증가(홀수만 적용하기 위해 )
    //숫자 29를 입력받았을 경우 루트29 보다 작은 i는 3,5이다 
    //3과 5로 나누었을때 0이 아니므로 소수이다. 

        if(num%i==0){
            return 0;
        }
        
    }
        return 1;


}
int main(int argc, char const *argv[]) {
	int M;
    int N;
    int num;

    scanf("%d %d",&M, &N);

    for(num=M; num<=N; num++){
        if(is_prime(num)){
        printf("%d\n", num);
       }
    }
    return 0;
}
    
    
