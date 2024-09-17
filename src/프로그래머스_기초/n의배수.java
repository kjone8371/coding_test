package 프로그래머스_기초;

public class n의배수 {


    public int solution(int num, int n) {

        if(num % n == 0) {
            return 1;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        n의배수 a = new n의배수();
        System.out.println(a.solution(98, 2));
    }
}
