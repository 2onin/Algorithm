import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String S = br.readLine();
        int leng = S.length();
        for (int i = 0; i < arr.length; i++) {
            if(S.contains(arr[i])){
                S = S.replace(arr[i], "!");
            }
        }
        sb.append(S.length());
        System.out.println(sb);
    }
}
