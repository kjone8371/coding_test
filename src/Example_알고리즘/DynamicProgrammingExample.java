package Example_알고리즘;


//동적 계획법
//동적 계획법은 복잡한 문제를 작은 하위 문제로 나누고, 그 결과를 저장해 중복 계산을 피하는 방법입니다.
public class DynamicProgrammingExample {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n + 1];
        arr[0] = arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];  // 피보나치 수열 계산
        }

        System.out.println("피보나치 수열의 " + n + "번째 값: " + arr[n]);
    }
}

