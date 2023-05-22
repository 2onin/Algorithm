import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int arr[] = new int[30];
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                sb.append(i+1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
