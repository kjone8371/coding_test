package 빅오표기법;

//로그 시간 복잡도
//로그 시간 복잡도는 입력 크기가 커질수록 실행 시간이 로그에 비례해 증가하는 경우입니다. 이진 탐색이 대표적인 예입니다.
public class LogarithmicTime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
