import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        if(N < 10){
            N *= 10;
        }
        int M = -1;
        int cnt = 0;
        int N2 = N;
        while (N != M){
            int mix = N2 / 10 + N2 % 10;
            M = (N2 % 10) * 10 + (mix % 10);
            N2 = M;
            cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}