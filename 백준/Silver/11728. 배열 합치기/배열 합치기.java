import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 포인터 두개를 지정, 배열 첫번째 위치 끼리 비교, 작은 쪽의 배열을 새로운 배열에 넣어주고 index값 증가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[] = new int[N];
        int B[] = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int APointer = 0, BPointer = 0;

        while (APointer < N && BPointer < M){
            if(A[APointer] < B[BPointer]){
                sb.append(A[APointer++]).append(" ");
            } else {
                sb.append(B[BPointer++]).append(" ");
            }
        } //while 끝
        while(APointer < N){
            sb.append(A[APointer++]).append(" ");
        }
        while(BPointer < M){
            sb.append(B[BPointer++]).append(" ");
        }
        
        System.out.println(sb);
    }
}
