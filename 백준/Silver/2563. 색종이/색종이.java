import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // x,y 값 둘 다 차이가 10이내 이면 겹친다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[100][100];
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            // 입력받은 x,y값 기준으로 사각형 색칠하기
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[x+j][y+k]= 1;
                }
            }
        }
        //전체 도화지를 탐색하며 사각형 넓이 계산
        for (int j = 0; j < 100; j++) {
            for (int k = 0; k < 100; k++) {
                if (arr[j][k] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
