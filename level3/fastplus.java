import java.io.BufferedReader; // 효율적인 입력을 처리하기 위한 BufferedReader 클래스
import java.io.BufferedWriter; // 효율적인 출력을 처리하기 위한 BufferedWriter 클래스
import java.io.IOException;    // 입출력 예외를 처리하기 위한 IOException 클래스
import java.io.InputStreamReader; // 표준 입력(System.in)을 읽기 위한 InputStreamReader 클래스
import java.io.OutputStreamWriter; // 표준 출력(System.out)을 쓰기 위한 OutputStreamWriter 클래스
import java.util.StringTokenizer;  // 입력 데이터를 분리(토큰화)하기 위한 StringTokenizer 클래스

// 클래스 정의
public class fastplus {

    // main 메서드: 프로그램 실행의 시작점
    public static void main(String[] args) throws IOException {

        // BufferedReader와 BufferedWriter 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 표준 입력을 위한 BufferedReader 초기화
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 표준 출력을 위한 BufferedWriter 초기화

        // 첫 번째 입력 줄에서 정수 N을 읽음 (입력 횟수)
        int N = Integer.parseInt(br.readLine()); // br.readLine()으로 문자열을 읽고, 정수로 변환

        StringTokenizer st; // 입력 데이터를 나누기 위한 StringTokenizer 객체 선언

        // N번 반복하여 입력 처리 및 출력
        for (int i = 0; i < N; i++) {
            // 한 줄의 입력을 공백(" ") 기준으로 나눔
            st = new StringTokenizer(br.readLine(), " ");
            // 첫 번째와 두 번째 숫자를 각각 읽고 더한 결과를 BufferedWriter에 기록
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        // BufferedReader 닫기 (자원 해제)
        br.close();
        // BufferedWriter 버퍼를 비우고 출력
        bw.flush();
        // BufferedWriter 닫기 (자원 해제)
        bw.close();
    }
}
