package com.toozhao.sort;

/**
 * 
 * @author Junv
 * 
 */
public class SelectSort {
	// 定义需要排序的数
	private static int[] array = { 10, 50, 8, 29, 30, 17, 12, 40, 32, 7, 4, 22 };

	public static void main(String args[]) {
		sort(array);
		for (int flag : array) {
			System.out.print(flag + " ");
		}
	}

	public static void sort(int[] data) {
		// 外层循环一次，找到i to (data.length-1)这个数组中最小的一个数。
		for (int i = 0; i < (data.length - 1); i++) {
			// temp用来标注值最小的那个数。
			int temp = i;
			for (int j = i + 1; j < data.length; j++) {
				// 将temp 始终标记为最小那个数。
				if (data[j] < data[temp]) {
					temp = j;
				}
			}
			// 如果i != temp 说明，最小那个数为data[temp],则交换。
			if (i != temp) {
				int t = data[i];
				data[i] = data[temp];
				data[temp] = t;

			}
		}
	}

}
