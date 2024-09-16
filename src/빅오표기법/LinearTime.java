package 빅오표기법;


//선형 시간 복잡도
//입력 크기가 커짐에 따라 실행 시간이 비례하여 증가하는 경우입니다.
public class LinearTime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]); // 배열의 모든 요소를 출력하는데 배열 크기만큼 시간이 걸림
        }
    }
}
