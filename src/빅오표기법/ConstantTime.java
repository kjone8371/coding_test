package 빅오표기법;


//상수 시간 복잡도
//입력 크기와 상관없이 항상 일정한 시간이 걸리는 경우입니다.
public class ConstantTime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]); // 배열의 첫 번째 요소를 출력하는데 항상 동일한 시간이 걸림
    }
}
