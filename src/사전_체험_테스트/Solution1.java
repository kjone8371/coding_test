package 사전_체험_테스트;

import java.util.Scanner;

class Solution{
    public int[] solution(int[][] v) {
        int[] answer = new int[2];

        // x좌표를 비교
        if (v[0][0] == v[0][1]) {
            answer[0] = v[2][0];
        }else if(v[0][0] == v[2][0]){
            answer[0] = v[1][0];
        }else {
            answer[0] = v[0][0];
        }

        // y좌표를 비교
        if(v[0][1] == v[1][1]){
            answer[1] = v[2][1];
        }else if(v[0][1] == v[2][1]){
            answer[1] = v[1][1];
        }else {
            answer[1] = v[0][1];
        }

        return answer;
    }
}


public class Solution1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        // 테스트할 입력 데이터
        int[][] v = {{1, 4}, {3, 4}, {3, 10}};

        // 결과를 계산하여 받아옴
        int[] answer = sol.solution(v);

        // 결과 출력
        System.out.println("The missing point is: (" + answer[0] + ", " + answer[1] + ")");
    }
}
