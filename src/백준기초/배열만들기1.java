package 백준기초;

import java.util.Arrays;
//정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
public class 배열만들기1 {
    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for(int i = 1; i <= n / k; i++){
            answer[i - 1] = k * i;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(100, 5)));
    }
}
