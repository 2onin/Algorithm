import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
        }

        int M = Integer.parseInt(st.nextToken());
        int temp = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            int cnt = (J-I+1)/2;
                for (int j = 0; j < cnt; j++) {
                    temp = arr[I - 1 + j];
                    arr[I - 1 + j] = arr[J - 1 - j];
                    arr[J - 1 - j] = temp;
                }
        }
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);

    }
}
