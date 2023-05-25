import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }
        String S = br.readLine();


        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = (int)c -97;
            if(alpha[index] != -1){
                continue;
            }
            alpha[index] = i;
        }
        for (int i = 0; i < alpha.length; i++) {
            sb.append(alpha[i]).append(' ');
        }
        System.out.println(sb);
    }
}
