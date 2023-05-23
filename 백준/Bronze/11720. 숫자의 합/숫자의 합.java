import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(S.substring(i, i+1));
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
