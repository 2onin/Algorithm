import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int []dx = {1, -1, 0 ,0};
    static int []dy = {0, 0, 1, -1};
    static int [][]melt;
    static int [][]map;
    static boolean [][]visited;
    static int year = 0;

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        melt = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while(true) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] != 0 && !visited[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            if (count == 0) {
                sb.append(0);
                break;
            } else if (count > 1) {
                sb.append(year);
                break;
            }

            melting();
            year++;
        }
        System.out.println(sb);
    }
    static void dfs(int x, int y){
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 & ny >= 0 && nx < N && ny < M) {
                if(map[nx][ny] == 0){
                    melt[x][y]++;
                }
                if(map[nx][ny] != 0 && !visited[nx][ny]){
                    dfs(nx, ny);
                }
            }

        }
    }

    static void melting(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] -= melt[i][j];
                if(map[i][j]< 0)
                    map[i][j] = 0;

                visited[i][j] = false;
                melt[i][j] = 0;
            }

        }
    }
}
