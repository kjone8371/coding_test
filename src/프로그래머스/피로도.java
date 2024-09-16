package 프로그래머스;

public class 피로도 {
//    static boolean[] visited;
//    static int count = 0;
//
//    public int solution(int k, int[][] dungeons) {
//        visited = new boolean[dungeons.length];
//        dfs(0, k, dungeons);
//        return count;
//    }
//
//    private void dfs(int depth, int fatigue, int[][] dungeons){
//        for (int i = 0; i < dungeons.length; i++){
//            if (visited[i] || dungeons[i][0] > fatigue) {
//                continue;
//            }
//            visited[i] = true;
//            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
//            visited[i] = false;
//        }
//        count = Math.max(count, depth);
//    }


    // 다른 방법
    int dfs(int k, int[][] dungeons) {
        int cnt = 0;
        for(int[] d : dungeons) {
            int a = d[0], b = d[1];
            if(a <= k) {
                d[0] = 9999;
                cnt = Math.max(1 + dfs(k - b, dungeons), cnt);
                d[0] = a;
            }
        }
        return cnt;
    }
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        return dfs(k, dungeons);
    }

    public static void main(String[] args) {

        피로도 solution = new 피로도();

        System.out.println(solution.solution(80, new int[][]{{80,20},{50,40},{30,10}}));
    }
}

