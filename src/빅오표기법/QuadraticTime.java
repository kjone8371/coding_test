package 빅오표기법;

//이차 시간 복잡도
//이중 루프와 같이 입력 크기가 커질수록 시간 복잡도가 제곱으로 증가하는 경우입니다.
public class QuadraticTime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);  // 이중 루프, 배열 크기가 커질수록 시간이 n^2에 비례해 증가
            }
        }
    }
}
