package 알고리즘_테스트_lv0;

import java.util.Scanner;

public class pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c*c - a*a;

        System.out.println(b_square);
    }
}
