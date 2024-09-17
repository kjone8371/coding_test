package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;


//아직 이해 부족
public class 카펫 {
    public static int[] solution(int brown, int yellow) {
//        int[] answer = new int[3];
//        int sum = brown + yellow;

        //다른 예시 코드
        int a = (brown+4)/2;
        int b = yellow+2*a-4;
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2,(int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;

//        for(int i = 3; i < sum; i++){ // for문은 가로(i)와 세로(j)를 찾기 위해 반복합니다. 반복문이 3부터 시작하는 이유는 최소 가로, 세로 길이가 3 이상이어야 갈색 테두리와 노란색 영역을 가질 수 있기 때문입니다.
//            int j = sum / i; //j는 현재 i 값에 따라 세로의 길이를 나타냅니다. 전체 카펫의 크기인 sum을 i로 나누어 j를 구합니다. 이렇게 해서 가로(i)와 세로(j)의 가능한 조합을 찾습니다.
//            if(sum % i == 0 || j >= 3){
//                int col = Math.max(i, j);
//                int row = Math.min(i, j);
//                int center = (col - 2) * (row - 2); // 이 부분에서 노란색 격자의 수를 계산합니다. 노란색 격자는 카펫의 중앙에 위치하는데, 테두리 갈색 격자를 제외한 영역이 바로 노란색 격자의 영역입니다.
//                if(center == yellow){
//                    answer[0] = col;
//                    answer[1] = row;
//                    return answer;
//                }
//            }
//        }
//        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(Arrays.toString(solution(a, b)));
    }
}
