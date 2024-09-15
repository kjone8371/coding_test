package 자바_자료구조_알고리즘_공부;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 카드 리스트

public class 완전탐색 {
//    static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};
//
//    public static void main(String[] args) {
//        System.out.println("1. 순환 호출을 이용한 이진 탐색");
//        System.out.println(binarySearch1(5, 0, arr.length-1)); // 2
//
//        System.out.println("\n2. 반복을 이용한 이진 탐색");
//        System.out.println(binarySearch2(20, 0, arr.length-1)); // 6
//
//    }
//
//    // 재귀적 탐색
//    static int binarySearch1(int key, int low, int high) {
//        int mid;
//
//        if(low <= high) {
//            mid = (low + high) / 2;
//
//            if(key == arr[mid]) { // 탐색 성공
//                return mid;
//            } else if(key < arr[mid]) {
//                return binarySearch1(key ,low, mid-1); // 왼쪽 부분 탐색
//            } else {
//                return binarySearch1(key, mid+1, high); // 오른쪽 부분 탐색
//            }
//        }
//
//        return -1; // 탐색 실패
//    }
//
//    // 반복적 탐색
//    static int binarySearch2(int key, int low, int high) {
//        int mid;
//
//        while(low <= high) {
//            mid = (low + high) / 2;
//
//            if(key == arr[mid]) {
//                return mid;
//            } else if(key < arr[mid]) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//
//        return -1; // 탐색 실패
//    }

    static int[] sam;
    static int[] sum;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        sam = new int[51];
        sum = new int[5000];
        for (int i = 1; i <= 50; i++) {
            sam[i] = i * (i + 1) / 2;
        }

        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= 50; j++) {
                for (int k = 1; k <= 50; k++) {
                    sum[sam[i] + sam[j] + sam[k]] = 1;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(sum[N] == 1 ? 1 : 0);
        }
    }
}
