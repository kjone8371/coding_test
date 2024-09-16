package 백준알고리즘;


import java.util.Scanner;


//백설 공주와 일곱 난쟁이
public class 백준3040번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[9];
//        int sum = 0;
//        int num1 = 0; // 난쟁이가 아닌 애
//        int num2 = 0; // 난쟁이가 아닌 애
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] += sc.nextInt();
//            sum += arr[i];
//        }
//
//        for(int i = 0; i < arr.length - 1; i++){
//            for(int j = i; j < arr.length; j++){
//                if(sum - arr[i] - arr[j] == 100 && i != j){
//                    num1 = i;
//                    num2 = j;
//                    break;
//                }
//            }
//            if (num1 != 0 || num2 != 0) { // 난쟁이가 아닌 애들 찾으면 루프 종료
//                break;
//            }
//        }
//        System.out.println(arr[num1]);
//        System.out.println(arr[num2]);
//
//        // 난쟁이가 아닌 애들(num1, num2)을 제외한 다른 난쟁이들 출력
//        for (int i = 0; i < arr.length; i++) {
//            if (i != num1 && i != num2) {
//                System.out.println(arr[i]);  // 나머지 7명의 난쟁이 키 출력
//            }
//        }

        int[] arr = new int[9];
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length; j++){
                if(sum - arr[i] - arr[j] == 100 && i != j){
                    num1 = i;
                    num2 = j;
                    break;
                }
            }
            if(num1 != 0 || num2 != 0){
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){
                if(i != num1 && i != num2) {
                    System.out.println(arr[i]);
                }
        }

        // && => 동시에 라는 뜻 그러니까 같이 움직이여
        // || => or 아니면 또는 이라는뜻 그래서 if문을 사용할때 ||를 사용하면 1 == 100 && 100 >= 1000
    }
}

