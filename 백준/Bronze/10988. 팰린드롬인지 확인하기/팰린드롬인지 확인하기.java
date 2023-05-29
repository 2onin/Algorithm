import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        StringBuffer SB = new StringBuffer(S);
        String reverse = SB.reverse().toString();

        if (S.equals(reverse)){
            sb.append(1);
        } else {
            sb.append(0);
        }
        System.out.println(sb);

    }
}
