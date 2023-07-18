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

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            sum += arr[i];
            for (int j = i+1; j < N; j++) {
                sum += arr[j];
                for (int k = j+1; k < N; k++) {
                    sum += arr[k];
                    if(sum > max && sum <= M){
                        max = sum;
                    }
                    sum -= arr[k];
                }
                sum -= arr[j];
            }
            sum -= arr[i];
        }

        System.out.println(max);


    }

}
