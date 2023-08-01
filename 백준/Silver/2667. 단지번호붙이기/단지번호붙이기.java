import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int N;
    static int[][] map;
    static boolean[][] visted;
    static List<Integer> results = new ArrayList<>();
    static int n = 0;

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String arr[] = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }

        }

        boolean[][] visted = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (map[i][j]==1 && visted[i][j] == false) {
                    n++;
                    dfs(map, visted,i, j);
                    if(cnt > 0){
                        results.add(cnt);
                        cnt = 0;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(results);
        sb.append(results.size()).append("\n");
        for (int result:results) {
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int[][] map, boolean[][] visted, int i, int j) {
        map[i][j] = n;
        visted[i][j] = true;

        cnt++;

        if (j+1 < N && visted[i][j+1] == false && map[i][j+1]==1){ // 우측
            dfs(map, visted, i, j+1);
        }
        if (j-1>=0 && visted[i][j-1] == false && map[i][j-1]==1){ // 좌측
            dfs(map, visted,i, j-1);
        }
        if (i-1>=0 && visted[i-1][j] == false && map[i-1][j]==1){ // 위
            dfs(map, visted,i-1, j);
        }
        if (i+1 < N && visted[i+1][j] == false && map[i+1][j] ==1){
            dfs(map,visted, i+1, j);
        }
    }

}
