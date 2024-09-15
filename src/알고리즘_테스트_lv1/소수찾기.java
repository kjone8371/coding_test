package 알고리즘_테스트_lv1;

public class 소수찾기 {

    public int solution(int n) {
        int answer = 0;

        int[] number = new int[n+1];

        for(int i = 0; i < n+1; i++) number[i] = i;

        for(int i = 2; i < n+1; i++) {
            if(number[i] != 0) {
                for(int j=i+i; j<n+1; j+=i) {
                    number[j] = 0;
                }
            }
        }

        for(int i = 2; i < n+1; i++) {
            if(number[i] != 0) answer++;
        }

        return answer;

    }

    public static void main(String[] args) {
        소수찾기 a = new 소수찾기();
        System.out.println(a.solution(10));
    }
}
