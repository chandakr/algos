import java.util.Arrays;

public class Test {
	
	public void insertionSort(){
		int[] array = {1,2,1,3,4,1};
		int n = array.length;
		
		for (int i=1; i < n; i++) {
			for(int j=0; j <i; j++){
				if(array[j] > array[i]){
					int temp = array[j];
					array[j]=array[i];
					array[i]=temp;
							
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
	}

	public void selectionSort(){
		int[] array = {1,2,1,3,4,1};
		int n = array.length;
		
		for (int i : array) {
			for(int j=i+1; j <n; j++){
				if(array[j-1] > array[j]){
					int temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
							
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
	}

	public static void quickSort(int high, int low, int[] result){

		int i=low;
		int j=high;
		int pivot = low + (high-low)/2;
		
		while(i <=j){
			while(result[i] < pivot){
				i++;
			}
			while(result[j] > pivot){
				j--;
			}
			
			if(i<=j){
				int temp = result[j];
				result[j] = result[i];
				result[i]=temp;
				i++;
				j--;
			}
		}
	
		if(low < j){
			quickSort(low,j, result);
		}

		if(i < high){
			quickSort(i, high, result);
		}
		
	}
		

	public static void main(String [] args) {
		int[] array = {1,2,1,3,4,1};
		int n = array.length;
		quickSort(5, 0, array);
		System.out.println(Arrays.toString(array));
		
		for (int i=1; i < n; i++) {
			for(int j=0; j <i; j++){
				if(array[j] > array[i]){
					int temp = array[j];
					array[j]=array[i];
					array[i]=temp;
							
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
}
