import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int min;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        min = 1000000;

        for (int i = 0; i < N; i++) {
            getConstruct(i);
        }
        if (min == 1000000){
            System.out.println(0);
        }else {
            System.out.println(min);
        }
    }
    public static void getConstruct(int i){
        int construct = i + (i/100000) + ((i%100000)/10000) + ((i%10000)/1000) + ((i%1000)/100) + ((i%100)/10) + (i%10);
        if(construct == N && construct< min){
            min = i;
        }
    }

}
