package 프로그래머스_기초;

public class 문자열의_앞의_n글자 {
    public String solution(String my_string, int n){
        return my_string.substring(0,n);
    }

    public static void main(String[] args) {
        문자열의_앞의_n글자 a = new 문자열의_앞의_n글자();
        System.out.println(a.solution("He110W0r1d", 5));
    }
}
