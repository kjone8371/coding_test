public class Arrays {
    public static void main(String[] args) {
        // 2차원 배열
        int[][]arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };



        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
