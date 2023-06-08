import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = 2;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            R = R+ (R-1);
        }
        System.out.println(R * R);
    }
}
