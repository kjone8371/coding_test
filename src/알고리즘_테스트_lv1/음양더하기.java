//package 알고리즘_테스트_lv1;
//
//public class 음양더하기 {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 0;
//        for(int i = 0; i < signs.length; i++){
//            if(signs[i]){
//                answer += absolutes[i];
//            }else {
//                answer -= absolutes[i];
//            }
//        }
//
//        return answer;
//    }
//    public static void main(String[] args) {
//        음양더하기 s = new 음양더하기();
//        System.out.println(s.solution(new int[]{4, 7, 12}, new boolean[]{"true","false","true"}));
//    }
//}
