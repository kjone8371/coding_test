package Example_알고리즘;


//완전탐색
//가능한 모든 경우의 수를 탐색하여 답을 찾는 방식입니다.
public class BruteForceExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,7 ,8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 20;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) { // j = i로 변경
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target); // 모든 경우의 수를 구함
                }
            }
        }


    }
}
