package 알고리즘_테스트;

import java.util.Scanner;

public class age_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        String ageType = sc.next();
        int answer = 0;

        if(ageType.equals("Korea")) {
            answer = 2024 - year + 1;
        }else if(ageType.equals("Year")){
            answer = 2024 - year;
        }

        System.out.println(answer);

    }
}
