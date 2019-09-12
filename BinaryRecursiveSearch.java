public class BinaryRecursiveSearch implements Practice03Search{

	public String searchName(){
		return "Recursive Binary Search";
	}
	public int binarySearch(int[] array, int n, int begin, int end){
		int mid = (begin + end)/2;

		if(end < begin){
			return -1;
		}
		if(n < array[mid]){
			return binarySearch(array, n, begin, mid - 1);
		}
		if(n > array[mid]){
			return binarySearch(array, n, mid + 1, end);
		}
		if(n == array[mid]){
			return mid;
		}
		return -1;

	}
	public int search(int[] array, int n){
		int begin = 0;
		int end = array.length - 1;
		return binarySearch(array, n, begin, end);
	}

}