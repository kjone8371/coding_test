package 알고리즘_테스트_lv0;

import java.util.Scanner;

public class 수나누기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        // 문제 진짜 정답
        while(number > 0){
            answer += number % 100;
            number /= 100;
        }

//        //???? 걍 아무생각 없이 코드 짰더니 풀림...
//        for(int i = 1; i <2; i++){
//            answer += number % 1000;
//            number /= 1000;
//        }

        System.out.println(answer);
    }
}
