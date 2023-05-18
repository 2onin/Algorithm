import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st,st2;
        st =  new StringTokenizer(br.readLine());
        st2 =  new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());


        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st2.nextToken()));
            if (A.get(i) < X) {
                sb.append(A.get(i)).append(" ");
            }

        }
        System.out.println(sb);
        br.close();
    }
}