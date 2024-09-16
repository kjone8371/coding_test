package Example_알고리즘;

import java.util.ArrayList;
import java.util.List;


//백트래킹
//백트래킹은 모든 가능성을 탐색하면서 해답을 찾는 과정에서 조건에 맞지 않으면 되돌아가는 방식입니다.
// 주로 퍼즐이나 조합 문제를 해결하는 데 사용됩니다.
public class BacktrackingExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        System.out.println(result);
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;  // 중복 방지
                tempList.add(nums[i]);
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);  // 마지막 요소 제거하고 백트래킹
            }
        }
    }
}

