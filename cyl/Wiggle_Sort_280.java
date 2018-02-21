public class Wiggle_Sort_280 {

	// version 1 :
	// thoughts:sort , split, insert
	// Time : nlog(n)
	// space : n

	// public void wiggleSort(int[] nums) {
	// if (nums == null || nums.length == 0) {
	// return;
	// }
	// int[] result = nums.clone();
	// Arrays.sort(result);
	// int smallArrayTail = 0;
	// if (nums.length % 2 == 0) {
	// smallArrayTail = nums.length / 2 - 1;
	// } else {
	// smallArrayTail = nums.length / 2;
	// }
	// int j = 0;
	// for (int i = 0; i <= smallArrayTail; i++) {
	// nums[j] = result[i];
	// j +=2;
	// }
	// int k = 1;
	// for (int i = smallArrayTail + 1; i < nums.length; i++) {
	// nums[k] = result[i];
	// k += 2;
	// }

	// }

	// version 2 :
	// thoughts:sort in place(swap), nums's relationship is binded with position
	// Time : n
	// space : 1
	// caution: start point and end position

	public void wiggleSort(int[] nums) {
		// nums.length = 0 is included
		if (nums == null) {
			return;
		}
		// starts with 1, compares with former one
		for (int i = 1; i < nums.length; i++) {
			if (i % 2 == 1 && nums[i] < nums[i - 1] || i % 2 == 0
					&& nums[i] > nums[i - 1]) {
				swap(i, nums);
			}
		}

	}

	private void swap(int i, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[i - 1];
		nums[i - 1] = temp;
	}

}