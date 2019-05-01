
public class S1TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}
