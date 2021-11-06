package P1_Ordenamiento;

public class QuickSort {
	// Algoritmo que ordena un array por QuickSort
	
	public static void sort(int arr[]) {
		int n = arr.length;
		quickSort(arr, 0, n-1);
	}
	
	static void quickSort(int[] arr, int left, int right) {
	    if (left < right) 
	    {
	           
	        int pi = partition(arr, left, right);
	  
	        // Separa el array por pi y usa la recursividad.
	        quickSort(arr, left, pi - 1);
	        quickSort(arr, pi + 1, right);
	    }
	}
	static void swap(int[] arr, int i, int j) {
	    int swap = arr[i];
	    arr[i] = arr[j];
	    arr[j] = swap;
	}
	  
	static int partition(int[] arr, int left, int right) {
	      
	    // pivot por ahora usa el elemento de la derecha.
	    int pivot = right; 
	    
	    swap(arr, pivot, right);
	    
	    int store = left;
	    for(int i = left; i <= right - 1; i++) {  
	        
	        if (arr[i] <= arr[pivot]) {
	            
	        	swap(arr, i, store);
	            store++;
	        }
	    }
	    swap(arr, store, right);
	    return store;
	}
	  
}
