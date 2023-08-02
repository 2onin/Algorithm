import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int map[][];
    static boolean visited[][];

    static int M;
    static int N;
    static int K;

    static int n;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) { // 테스트 케이스 1 시작
            n = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                map[Y][X] = 1;
            } // 배추 위치 넣기

            visited = new boolean[N][M];
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(map[i][j] == 1 && visited[i][j] == false){
                        n++;
                        dfs(map, visited, i, j);
                    }//조건문 끝
                }
            }

            sb.append(n).append("\n");

        } // 테스트 케이스 끝
        System.out.println(sb);

    }

    private static void dfs(int map[][], boolean visited[][], int i, int j){
        visited[i][j] = true;

        if(j+1 < M && map[i][j+1] == 1 &&visited[i][j+1] == false){ // 우
            dfs(map, visited, i, j+1);
        }
        if(j-1 >= 0 && map[i][j-1] == 1 &&visited[i][j-1] == false){ // 좌
            dfs(map, visited, i, j-1);
        }
        if(i-1 >= 0 && map[i-1][j] == 1 &&visited[i-1][j] == false){ // 상
            dfs(map, visited, i-1, j);
        }
        if(i+1 < N && map[i+1][j] == 1 && visited[i+1][j] == false){ // 하
            dfs(map, visited, i+1, j);
        }
    }
}
