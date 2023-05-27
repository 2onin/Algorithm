import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int arr[] = {1, 1, 2, 2, 2, 8};
        int arr2[] = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            arr[i] -= arr2[i];
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}
