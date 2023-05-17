import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1-i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < i+1; k++) {
                bw.write("*" ) ;
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
