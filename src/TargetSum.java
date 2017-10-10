/**
 * @author lees13
 * Find the indices of two numbers that add up to target.
 */


public class TargetSum {
	public static void main (String[] args) {
		int[] nums = {1, 2, 3, 4, 7};
		int[] ans = twoSum(nums, 7);
		System.out.printf("%d + %d = %d", nums[ans[0]], nums[ans[1]], 7);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    if(nums[i] + nums[j] == target){
                        a = i;
                        b = j;
                    }
                }
            }
        }
        int[] result = {a, b};
        return result;
    }
}
