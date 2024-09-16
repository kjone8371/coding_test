package Example_알고리즘;
//이진탐색
//정렬된 배열에서 중간값과 비교하여 탐색 범위를 절반씩 줄여가며 값을 찾는 알고리즘입니다.
public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("찾은 인덱스: " + result);

    }

    public static int binarySearch(int[] arr, int target, int left, int right){
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binarySearch(arr, target, mid + 1, right);
        return binarySearch(arr, target, left, mid - 1);
    }
}
