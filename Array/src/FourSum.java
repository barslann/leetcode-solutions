import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;

        // expected result -> [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

        System.out.println(fourSum(nums,target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int sze = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i< sze; ++i){
            for(int j = i+1; j< sze-2; ++j){
                int lo= j+1;
                int hi= sze-1;
                while(lo < hi){
                    int sum = nums[i] + nums[j] + nums[lo] + nums[hi];
                    if(sum == target){
                        set.add(new ArrayList<Integer>(List.of(nums[i],nums[j],nums[lo++],nums[hi--])));
                    }else if(sum > target){
                        --hi;
                    }else{
                        ++lo;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}

