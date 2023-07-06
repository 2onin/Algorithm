import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean isDemical(int n){
        if (n==1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = M; i < N+1; i++) {
            if(isDemical(i)){
                sum += i;
                arr.add(i);
            }
        }
        if (sum == 0){
            sum = -1;
        }
        sb.append(sum);
        if (!arr.isEmpty()) {
            sb.append("\n").append(arr.get(0));
        }
        System.out.println(sb);
    }
}
