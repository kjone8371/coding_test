package 알고리즘_테스트_lv1;

public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
//        StringBuilder sb = new StringBuilder();
//
//        // 문자열 s 순회
//        for (char ch : s.toCharArray()) {
//            // 변환 횟수 기록하기 위한 count
//            int count = 0;
//
//            // index 크기 만큼 순회하여 변환
//            while (count < index) {
//                // 현재 문자 ch가 z이면 a로 변환, 아니면 다음 문자로 변환
//                if (ch == 'z') {
//                    ch = 'a';
//                } else {
//                    ch++;
//                }
//
//                // 현재 문자가 skip 문자열에 포함되지 않는 경우
//                if (!skip.contains(String.valueOf(ch))) {
//                    count++;
//                }
//            }
//            // 변환된 문자 sb에 추가
//            sb.append(ch);
//        }
//        return sb.toString();
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        둘만의암호 d = new 둘만의암호();
        System.out.println(d.solution("aukks", "wbqd", 5));
    }
}



//class test{
//    StringBuilder sb = new StringBuilder();
//    Set<Character> skipSet = new HashSet<>();
//
//    // skip 문자열을 Set으로 변환하여 빠르게 조회할 수 있게 함
//        for (char c : skip.toCharArray()) {
//        skipSet.add(c);
//    }
//
//    // 각 문자를 변환
//        for (char ch : s.toCharArray()) {
//        char newCh = ch;
//        int count = 0;
//
//        while (count < index) {
//            newCh++;
//
//            // 'z'를 넘어가면 'a'로 순환
//            if (newCh > 'z') {
//                newCh = 'a';
//            }
//
//            // 변환된 문자가 skip 문자열에 포함되지 않으면 카운트 증가
//            if (!skipSet.contains(newCh)) {
//                count++;
//            }
//        }
//
//        // 변환된 문자를 StringBuilder에 추가
//        sb.append(newCh);
//    }
//
//        return sb.toString();
//}