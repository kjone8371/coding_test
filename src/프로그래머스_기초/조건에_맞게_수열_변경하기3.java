package 프로그래머스_기초;

import java.util.*;

public class 조건에_맞게_수열_변경하기3 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(k % 2 == 0) {
                answer[i] = arr[i] + k;
            }else {
                answer[i] = arr[i] * k;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        조건에_맞게_수열_변경하기3 a = new 조건에_맞게_수열_변경하기3();

        System.out.println(Arrays.toString(a.solution(new int[]{1, 2, 3, 100, 99, 98}, 3)));
    }
}
