import java.util.Arrays;

public class test {

    public int[] solution(int[][] v){
        int[] answer = new int[2];

        // X좌표
        if(v[0][0] == v[1][0]){
            answer[0] = v[2][0];
        }else if(v[0][0] == v[2][0]){
            answer[0] = v[1][0];
        }else {
            answer[0] = v[0][0];
        }


        // Y좌표
        if(v[0][1] == v[1][1]){
            answer[1] = v[2][1];
        }else if(v[0][1] == v[2][1]){
            answer[1] = v[1][1];
        }else {
            answer[1] = v[0][1];
        }

        return answer;
    }

    public static void main(String[] args) {
        test s = new test();
        System.out.println(Arrays.toString(s.solution(new int[][]{{1, 4}, {3, 4}, {3, 10}})));

        System.out.println(Arrays.toString(s.solution(new int[][]{{1, 1}, {2, 2}, {1, 2}})));
    }
}
