import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] map;
    static int N;
    static boolean[][] visited;
    static List<Integer> results = new ArrayList<>();
    static Set<Integer> set = new HashSet<>();
    static int cnt;
    static int result = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                set.add(map[i][j]);
            }
        } // 배열 입력

        int max = Collections.max(set);

        for (int h = 0; h <= max; h++) {
            cnt = 0; // 안전영역 개수
            visited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] > h && !visited[i][j]){
                        cnt++;
                        dfs(i, j, h);
                    }
                }

            }
            results.add(cnt);
        }
        result = Collections.max(results);
        sb.append(result);
        System.out.println(sb);


    }

    private static void dfs(int x, int y, int h ) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < N && nx >= 0 && ny < N && ny >= 0){
                if (map[nx][ny] > h && !visited[nx][ny]) {
                    dfs(nx, ny, h);
                }
            }
        }
    }
}
