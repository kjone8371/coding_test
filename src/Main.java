//import 알고리즘_테스트.pythagoras;
//
//import java.util.Scanner;
//
//
//class Student{
//    //필드(Field)
//    String name; //이름
//    int age; //나이
//    int korean_scroe; //국어성적
//    int math_score; //수학성적
//    int english_score; //영어성적
//
//    //생성자(Constructor)
//    Student(String name, int age, int kor_score, int mat_score, int eng_score){
//        this.name = name;
//        this.age = age;
//        this.korean_scroe = kor_score;
//        this.math_score = mat_score;
//        this.english_score = eng_score;
//    }
//
//    //메소드(Method)
//    public void printScore() {
//        System.out.println("이름 : " + name);
//        System.out.println("나이 : " + age);
//        System.out.println("국어성적 : " + korean_scroe);
//        System.out.println("수학성적 : " + math_score);
//        System.out.println("영어성적 : " + english_score);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String name = "김아윤";
//        int age = 19;
//        int kor_score = 100;
//        int mat_score = 98;
//        int eng_score = 97;
//
//        Student student = new Student(name, age, kor_score, mat_score, eng_score);
//        student.printScore(); //인스턴스 메소드 호출
//
//
//        Scanner sc = new Scanner(System.in);
//
//        int year;
//        String ageType;
//
//        // 사용자에게 입력을 요청
//        System.out.println("숫자와 문자열을 동시에 출력");
//        System.out.print("숫자를 입력하세요: ");
//        year = sc.nextInt(); // 정수 입력 받기
//
//        // Scanner의 줄바꿈을 제거하기 위해 추가
//        sc.nextLine();
//
//        System.out.print("문자열을 입력하세요: ");
//        ageType = sc.nextLine(); // 문자열 입력 받기
//
//
//        // 입력된 값 출력
//        System.out.println("입력된 숫자: " + year);
//        System.out.println("입력된 문자열: " + ageType);
//    }
//    }
//}