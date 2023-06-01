import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //문자가 나올 때 연이어서 나오거나 한 번 나와야하고, 이후에 다시 나오면 안된다.
        //++인덱스 위치에는 같은 문자 가능 but, 그 외에는 불가
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int cnt = N;

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            boolean arr[] = new boolean[26];
            for (int j = 0; j < S.length() - 1; j++) {
                arr[S.charAt(j)-97] = true;
                if(S.charAt(j) != S.charAt(j+1)){
                    if(arr[S.charAt(j+1) - 97] == true){
                        cnt--;
                        break;
                    }
                }
            }

        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
