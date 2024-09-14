package 알고리즘_테스트_lv0;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

//        String str = sc.next();
//        int n = sc.nextInt();
//        for(int i = 0; i <= n; i++){
//            System.out.print(str);
//        }

//        System.out.println(str.repeat(n));


        String answer = "";

       for(int i = 0; i < a.length(); i++){
           char c = a.charAt(i);
           if(Character.isUpperCase(c)){
               answer += Character.toLowerCase(c);
           }else {
               answer += Character.toUpperCase(c);
           }
       }

        System.out.println(answer);
    }
}
