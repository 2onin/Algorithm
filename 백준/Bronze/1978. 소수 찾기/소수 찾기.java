import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean isDemical(int n){
        if(n == 1){
            return false;
        }
        for (int i = 2; i < n; i++) {

            if(n %i ==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(isDemical(n)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
