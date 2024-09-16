package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public static int[] solution(int[] answers){
        // 수포자 1, 2, 3의 패턴
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 점수를 저장할 배열
        int[] scores = new int[3];

        // 각 수포자의 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                scores[0]++;
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                scores[1]++;
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                scores[2]++;
            }
        }

        // 최고 점수를 찾기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최고 점수를 가진 수포자를 찾기
        int count = 0;
        for (int score : scores) {
            if (score == maxScore) {
                count++;
            }
        }

        // 결과 배열 생성
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result[index++] = i + 1;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        // 테스트 케이스
        int[] answers1 = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};

        // 결과 출력
        System.out.println(Arrays.toString(solution(answers1))); // 예상 결과: [1]
        System.out.println(Arrays.toString(solution(answers2))); // 예상 결과: [1, 2, 3]
    }
}
