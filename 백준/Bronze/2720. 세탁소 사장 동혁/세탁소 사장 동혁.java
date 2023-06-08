import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int Quarter, Dime, Nickel, Penny = 0;
        
        for (int i = 0; i < N; i++) {
            int C = Integer.parseInt(br.readLine());
            Quarter = C/25;
            C %= 25;
            Dime = C/10;
            C %= 10;
            Nickel = C/5;
            C %= 5;
            Penny = C;
            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
        }
    }
}
