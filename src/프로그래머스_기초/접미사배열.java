package 프로그래머스_기초;

import java.util.*;

public class 접미사배열 {

    public String[] test(String my_string){
        String[] answer = new String[my_string.length()];

        // 모든 접미사 생성
        for(int i = 0; i < answer.length; i++){
            answer[i] = my_string.substring(i);
        }

        // 접미사 배열을 사전순으로 정렬
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        접미사배열 sol = new 접미사배열();

        System.out.println(Arrays.toString(sol.test("banana")));
    }
}
