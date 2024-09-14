package 알고리즘_테스트_lv0;

public class Warehouse_organization {
    public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for(int i = 0; i < storage.length; i++){
            int clean_idx = -1;
            for(int j = 0; j < num_item; j++){
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }

            if(clean_idx == -1){
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Warehouse_organization storageSolution = new Warehouse_organization();

        String[] storage = {"apple", "banana", "apple", "orange", "banana"};
        int[] num = {5, 2, 3, 4, 1};

        String result = storageSolution.solution(storage, num);
        System.out.println("가장 많이 저장된 아이템은: " + result);
    }


}
