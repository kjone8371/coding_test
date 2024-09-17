package 프로그래머스_기초;

import java.util.Arrays;

public class 배열조각하기 {
    public int[] solution(int[] arr, int[] query) {
//        for(int i =0; i<query.length; i++) {
//            if(i % 2 == 0) {
//                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
//            }else {
//                arr = Arrays.copyOfRange(arr, query[i], arr.length);
//            }
//        }
//        return arr;


        for(int i = 0; i< query.length; i++){
            if(i % 2 == 0){
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        배열조각하기 a = new 배열조각하기();

        System.out.println(Arrays.toString(a.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2})));
    }
}
