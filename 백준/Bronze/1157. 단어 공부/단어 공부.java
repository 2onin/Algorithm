import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine().toUpperCase();
        int arr[] = new int[26];

        for (int i = 0; i < S.length(); i++) {
            int I =S.charAt(i) - 65;
            arr[I]++;
        }
        int max = 0;
        char c = '?';

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
                c = (char)(i + 65);
            } else if (max == arr[i]) {
                c = '?';
            }

        }
        System.out.println(c);
    }
}
