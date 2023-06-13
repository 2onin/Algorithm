import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            int n = Integer.parseInt(br.readLine());
            ArrayList arr = new ArrayList<>();
            int sum = 0;

            if(n == -1){
                break;
            }

            for (int i = 1; i < n; i++) {
                if(n % i ==0){
                    arr.add(i);
                    sum += i;
                }
            } // 배열에 약수 넣기
            if(sum == n){
                sb.append(n + " = ");
                for (int i = 0; i < arr.size(); i++) {
                    if(i == arr.size()-1){
                        sb.append(arr.get(i));
                    }else
                    sb.append(arr.get(i) + " + ");
                }
                System.out.println(sb);
                sb.setLength(0);
            } else {
                System.out.println(n + " is NOT perfect.");// 완전수이면, 출력
            }

        }// while
    }
}
