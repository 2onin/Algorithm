class Solution {
    // 컴퓨터 갯수에 맞춰서 check 배열을 만든다
    // check 배열이 방문이 되어 있으면 dfs로 방문한다
    // 방문하면 check배열과 네트워크 갯수를 하나 증가시킨다
    // 그리고 computers배열을 토대로 연결된 컴퓨터로 dfs 방문!
    
    public void dfs(int[] check, int[][] computers, int index){
        check[index] = 1;
        
        for(int i=0; i < check.length; i++){
            if(check[i] == 0 && computers[index][i] == 1){
                dfs(check, computers, i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] check = new int[n];
        for(int i = 0; i < n; i++){
            if(check[i] == 0){
                answer++;
                dfs(check, computers, i);
            }
        }
        return answer;
    }
}