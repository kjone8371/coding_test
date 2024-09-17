package 프로그래머스_기초;

public class 약수의합 {


    public int solution(int n){
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        약수의합 n = new 약수의합();
        System.out.println(n.solution(5));
    }
}
