package Example_자료구조;


//배열
//배열은 고정된 크기의 연속된 메모리 공간에 데이터를 저장하는 자료구조입니다. 인덱스를 사용하여 요소에 접근할 수 있습니다.
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
