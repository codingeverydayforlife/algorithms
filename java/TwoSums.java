import java.util.HashMap;
import java.util.Map;

/**
 * Created by ramalina on 2/28/18.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example: Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9 return [0, 1].
 *
 */
public class TwoSums {

    public static void main(String[] args) {

        int[] nums = {2,4,5,8,1,15,25};
        int target = 23;

        int[] desiredIndices = new int[2];

        Map<Integer,Integer> processMap = new HashMap<>();

        for(int i =0; i < nums.length ; i ++) {
            if(processMap.containsKey(nums[i])) {
                desiredIndices[0] = processMap.get(nums[i]);
                desiredIndices[1] = i;
            } else {
                processMap.put(target-nums[i],i);
            }
        }
        System.out.println("the desired indices are " + desiredIndices[0] + " and " + desiredIndices[1]);
    }
}
