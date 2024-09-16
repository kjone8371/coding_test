package 프로그래머스;

public class 최소직사각형 {

    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        // 각 명함의 가로와 세로 길이를 비교하여 최대 가로 길이와 최대 세로 길이를 결정
        for (int[] size : sizes) {
            int width = Math.min(size[0], size[1]);
            int height = Math.max(size[0], size[1]);
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        // 최대 가로 길이와 최대 세로 길이를 한 값을 리턴
        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
