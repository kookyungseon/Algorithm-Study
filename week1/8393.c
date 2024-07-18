#include <stdio.h>

int main(int argc, char const *argv[]) {
	int n;
	int sum = 0;

    scanf("%d",&n);
 
	for (int i = 0; i <= n; i++) { //0부터 n까지 i의 크기를 키우면서 
		sum += i; //더해준다 
	}
    printf("%d\n",sum);
	return 0;
}

