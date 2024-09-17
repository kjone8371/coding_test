package 프로그래머스;

public class 최소직사각형 {

    public static int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;


    }

    public static int test(int[][] sizes){
        int length = 0, height = 0;
        for(int [] card : sizes){
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(test(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
