package Example_알고리즘;


//재귀
//재귀는 함수가 자기 자신을 호출하는 방식으로 문제를 해결하는 방법입니다.
public class RecursionExample {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}

