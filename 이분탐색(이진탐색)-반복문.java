반복문으로 구현

public static boolean BSearch(int[] arr, int n) {
	int left = 0;
	int right = arr.length - 1;
	int mid;

	while (left <= right) {
		mid = (left + right) / 2;
		if (arr[mid] < n) left = mid + 1;
		else if (arr[mid] > n) right = mid - 1;
		else return true;
	}
	return false;
}
