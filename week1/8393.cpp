#include <iostream>
 
using namespace std;
//namespace 라는 이름 공간을 사용한다 
//std는 클래스 
//즉, 이름공간에 있는 클래스에 정의도어 있는 함수를 사용한다. 
//std에는 cout, cin, endl등 자주 쓰이는 함수가 정의되어있음
//c++에서 출력은 cout
 
int main(int argc, char const *argv[]) {
	int n;
	int sum = 0;
	cin >> n; //사용자에게 입력받아서 n에 저장
 
	for (int i = 0; i <= n; i++) { //0부터 n까지 i의 크기를 키우면서 
		sum += i; //더해준다 
	}
	cout << sum<< endl; ; //sum 값을 출력 -> 출력 후 줄 바꿈
	return 0;
}

