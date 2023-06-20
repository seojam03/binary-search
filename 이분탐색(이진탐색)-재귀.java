재귀로 구현

public static boolean BSearchRecursive(int[] arr, int n, int left, int right) {
	if(left > right) return false;
	
	int mid = (left + right) / 2;
       
	if (arr[mid] < n) 
       	return BSearchRecursive(arr, n, mid +1, right);
	else if (arr[mid] > n) 
       	return BSearchRecursive(arr, n, left, mid - 1);
	else 
       	return true;
	
}