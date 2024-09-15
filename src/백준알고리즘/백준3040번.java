package 백준알고리즘;


import java.util.Scanner;

public class 백준3040번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        int num1 = 0; // 난쟁이가 아닌 애
        int num2 = 0; // 난쟁이가 아닌 애

        for(int i = 0; i < arr.length; i++){
            arr[i] += sc.nextInt();
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
        }

        for(int i = 0; i < arr.length; i++){
            if(i == num1 || i == num2)
                continue;
                System.out.println(arr[i]);
        }
        sc.close();
    }
}

