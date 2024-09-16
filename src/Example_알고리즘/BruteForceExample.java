package Example_알고리즘;


//완전탐색
//가능한 모든 경우의 수를 탐색하여 답을 찾는 방식입니다.
public class BruteForceExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }


    }
}
