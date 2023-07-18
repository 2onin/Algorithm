import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sum = 0;
        int max = 0;
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        // 배열에 넣는 for문
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //조건 탐색 for문
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum > max && sum <= M){
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);

    }

}
