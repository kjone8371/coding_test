package 백준기초;

import java.util.Arrays;

public class n번째기초 {
    public static int[] solution(int[] num_list, int n){
        int[] answer = new int[num_list.length - n + 1];

        for (int i = n - 1; i < num_list.length; i++) {
            answer[i - n + 1] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3}, 3)));
        System.out.println(Arrays.toString(solution(new int[] {5, 2, 1, 7, 5}, 2)));
    }
}
