import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        // expected result -> [[2,2,3],[7]]

        System.out.println(combinationSum(candidates,target));

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList(),result);
        return result;
    }

    private static void backtrack(int[] cand, int start, int target, List<Integer> list, List<List<Integer>> result){
        // base case
        if(target < 0) return;
        if(target == 0) result.add(new ArrayList(list));

        for(int i = start; i < cand.length; ++i){
            list.add(cand[i]);
            backtrack(cand, i, target - cand[i], list, result);
            list.remove(list.size()-1);
        }
    }
}
