import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int sum = 0;
            int avg = 0;
            int cnt = 0;
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
                avg = sum / N;

            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > avg){
                    cnt++;
                }

            }

            double per = (double)cnt/N*100;

            System.out.println(String.format("%.3f%s", per,"%"));

        }
    }
}
