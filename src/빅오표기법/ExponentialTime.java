package 빅오표기법;

//지수 시간 복잡도
//재귀 호출이 겹쳐서 입력 크기가 증가할수록 실행 시간이 매우 급격히 증가하는 경우입니다.
//예시 피보나치 수열의 비효율적인 재귀
public class ExponentialTime {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // 중복 계산이 발생, 시간이 2^n에 비례
        }
    }
}
