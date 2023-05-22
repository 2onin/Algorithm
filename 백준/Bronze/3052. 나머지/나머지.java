import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            arr[i] = A % 42;
        }
        Set<Integer> set = new HashSet<>();
        for(int loop : arr){
            set.add(loop);
        }
        System.out.print(set.size());
    }
}
