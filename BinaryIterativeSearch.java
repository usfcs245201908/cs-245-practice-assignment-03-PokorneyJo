public class BinaryIterativeSearch implements Practice03Search{

	public String searchName(){
		return "Iterative Binary Search";
	}
	public int search(int[] array, int n){
		int begin = 0;
		int end = array.length - 1;
		int mid = 0;
		while(begin <= end){
			mid = (begin + end) / 2;
			if(array[mid] < n){
				begin = mid + 1;
			}
			else if(array[mid] > n){
				end = mid - 1;	
			}
			else{
				return mid;
			}
		}
		return -1;
	}
}