package 프로그래머스_기초;

import java.util.Scanner;

public class 더크게합치기 {

    public int solution(int a, int b){
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        if(Integer.parseInt(ab) >= Integer.parseInt(ba)){
            return Integer.parseInt(ab);
        }else {
            return Integer.parseInt(ba);
        }

    }

    public static void main(String[] args) {
        더크게합치기 ejzmrp = new 더크게합치기();

        int a, b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(ejzmrp.solution(a, b));

    }
}
