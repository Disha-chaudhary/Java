import java.util.*;

public class majorityelement {
    public static void majority(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Print elements that appear more than n/3
        for(int key : map.keySet()) {
            if(map.get(key) > nums.length / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 2, 1, 2, 3, 3};
        majority(nums);
    }
}
