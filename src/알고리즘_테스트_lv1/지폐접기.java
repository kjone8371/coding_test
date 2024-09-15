package 알고리즘_테스트_lv1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 지폐접기 {

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        // 지갑의 가로, 세로 크기를 정렬 (작은 쪽, 큰 쪽)
        int[] walletSorted = new int[] {Math.min(wallet[0], wallet[1]), Math.max(wallet[0], wallet[1])};
        // 지폐의 가로, 세로 크기를 정렬 (작은 쪽, 큰 쪽)
        int[] billSorted = new int[] {Math.min(bill[0], bill[1]), Math.max(bill[0], bill[1])};

        // 지폐의 크기가 지갑에 들어갈 때까지 반복
        while (billSorted[0] > walletSorted[0] || billSorted[1] > walletSorted[1]) {
            if (billSorted[0] >= billSorted[1]) {
                // 지폐의 가로가 세로보다 크거나 같은 경우 가로를 반으로 접음
                billSorted[0] = billSorted[0] / 2;
            } else {
                // 지폐의 세로가 가로보다 크거나 같은 경우 세로를 반으로 접음
                billSorted[1] = billSorted[1] / 2;
            }
            answer++;

            // 지폐의 크기를 다시 정렬
            int temp = Math.min(billSorted[0], billSorted[1]);
            billSorted[1] = Math.max(billSorted[0], billSorted[1]);
            billSorted[0] = temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        지폐접기 s = new 지폐접기();
        System.out.println(s.solution(new int[]{30, 15}, new int[]{26, 17}));
    }
}
