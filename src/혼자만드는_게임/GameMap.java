package 혼자만드는_게임;

import java.util.Scanner;

public class GameMap {

    public GameMap() {

        Scanner sc = new Scanner(System.in);

        System.out.println("게임을 시작 하시겠습니까? Y or N");
        String tell = sc.nextLine(); // 사용자 입력 받기

        if (tell.equalsIgnoreCase("Y")) {
            System.out.println("게임을 시작합니다...");
            // 게임 시작 코드 또는 다음 단계 호출
        } else if (tell.equalsIgnoreCase("N")) {
            System.out.println("게임을 종료합니다.");
            sc.close(); // Scanner 객체 닫기
            return; // 메서드 종료
        } else {
            System.out.println("잘못된 입력입니다. Y 또는 N을 입력해 주세요.");
            sc.close(); // Scanner 객체 닫기
            return; // 메서드 종료
        }

        // 게임 시작 후 추가적인 코드 (게임 로직)
        System.out.println("======= 면접 게임 ======");
        System.out.println("1. 시작");
        System.out.println("2. 자소서 작성 하기");
        System.out.println("3. 면접 예상 질문 보기");

        // Scanner 객체 닫기 (게임 종료 후)
        sc.close();
    }

}
