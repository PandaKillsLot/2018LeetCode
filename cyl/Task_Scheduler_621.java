public class Task_Scheduler_621 {

	/*
	 * 
	 * A4 B4 C1 -- N3 ABCAB-AB-AB
	 * 
	 * 
	 * 
	 * (MAX -1) * (interval + 1) + MAX_NUMBER C.F. LENGTH
	 */

	// version 1 :
	// thoughts: use the biggest one to stretch out
	// Time : n
	// space : n
	// caution : if there are multiple max frequency, you should add the
	// number of max instead of one

	public int leastInterval(char[] tasks, int n) {
			if (tasks == null || tasks.length == 0 || n < 0) {
				return -1;
			}

			char[] frequency = new char[26];
			//
			for (int i = 0; i < tasks.length; i++) {

				frequency[tasks[i] - 'A']++;
			}
			// get max
			int max = 0;
			for (int i = 0; i < frequency.length; i++) {
				max = Math.max(max, frequency[i]);
			}
			System.out.println(max);
			int max_count = 0;
			// get how many max number
			for (int i = 0; i < frequency.length; i++) {
				if (frequency[i] == max) {s
					max_count++;
				}
			}
			System.out.println(max_count);
			System.out.println(tasks.length);

			return Math.max((max - 1) * (n + 1) + max_count, tasks.length);

		}

}