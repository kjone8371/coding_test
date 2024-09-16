package 백준기초;

public class 문자열뒤의N글자 {
    public static String solution(String my_string, int n) {
        String answer = "";
        char[] my_stringC = my_string.toCharArray();

        for(int i = 0; i < n; i++){
            answer += my_stringC[my_stringC.length - n + i]; // 이거 코드 분석좀 하겠습니다.
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
    }
}
