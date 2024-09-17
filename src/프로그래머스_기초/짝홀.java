package 프로그래머스_기초;

public class 짝홀 {

    public int solution(int[] num_list) {

        int evenSum = 0;  // 짝수들의 합
        int oddSum = 0;   // 홀수들의 합

        for (int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                evenSum += num_list[i];
            }else {
                oddSum += num_list[i];
            }
        }

        return Math.max(evenSum, oddSum);
    }

    public static void main(String[] args) {
        짝홀 a = new 짝홀();

        System.out.println(a.solution(new int[] {4, 2, 6, 1, 7, 6}));
    }
}
