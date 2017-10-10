/*
 * Sort an int array using bubble sort
 * */

public class BubbleSort {
	private void sort(int[] nums) {
		for(int a = 0; a < nums.length; a++) {
			for(int i = 0; i < nums.length - 1; i++) {
				if(nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
	}
	
	private void print(int[] nums) {
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + "  ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] nums = {6, 9, 1, 3, 4, 4, 8, 2, 7};
		BubbleSort bubble = new BubbleSort();
		bubble.print(nums);
		
		bubble.sort(nums);
		bubble.print(nums);
	}
}
