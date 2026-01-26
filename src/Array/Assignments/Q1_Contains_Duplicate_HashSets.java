package Array.Assignments;
import java.util.HashSet;

public class Q1_Contains_Duplicate_HashSets {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true; // duplicate found
            }
            set.add(nums[i]);
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(arr)); // true
    }
}
