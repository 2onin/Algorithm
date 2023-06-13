import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList arr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if(N % i == 0){
                arr.add(i);
            }
        }
        if(arr.size () <K){
            sb.append(0);
        } else {
            sb.append(arr.get(K-1));
        }
        System.out.println(sb);
    }
}
