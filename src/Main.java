import 알고리즘_테스트.pythagoras;



class Student{
    //필드(Field)
    String name; //이름
    int age; //나이
    int korean_scroe; //국어성적
    int math_score; //수학성적
    int english_score; //영어성적

    //생성자(Constructor)
    Student(String name, int age, int kor_score, int mat_score, int eng_score){
        this.name = name;
        this.age = age;
        this.korean_scroe = kor_score;
        this.math_score = mat_score;
        this.english_score = eng_score;
    }

    //메소드(Method)
    public void printScore() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("국어성적 : " + korean_scroe);
        System.out.println("수학성적 : " + math_score);
        System.out.println("영어성적 : " + english_score);
    }
}

public class Main {
    public static void main(String[] args) {
        String name = "김아윤";
        int age = 19;
        int kor_score = 100;
        int mat_score = 98;
        int eng_score = 97;

        Student student = new Student(name, age, kor_score, mat_score, eng_score);
        student.printScore(); //인스턴스 메소드 호출
    }
}