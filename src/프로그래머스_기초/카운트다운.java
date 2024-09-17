package 프로그래머스_기초;

import java.util.*;



//문제 설명
// 정수 start_num와 end_num가 주어질 때,
// start_num에서 end_num까지 1씩 감소하는 수들을 차례로
// 담은 리스트를 return하도록 solution 함수를 완성해주세요.
// 예) 10 3 => [10, 9, 8, 7, 6, 5, 4, 3]
public class 카운트다운 {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = start_num--;
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(Arrays.toString(solution(a, b)));
    }
}
