package 프로그래머스_기초;

public class 접두사인지확인하기 {

    public int solution(String my_string, String is_prefix){
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        접두사인지확인하기 a = new 접두사인지확인하기();

        System.out.println(a.solution("banana", "ban"));
    }
}
