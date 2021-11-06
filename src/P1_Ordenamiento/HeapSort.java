package P1_Ordenamiento;

public class HeapSort {
	//Algoritmo para ordenar un array mediante heapSort.
	public static void sort(int arr[]) {
        int n = arr.length;
        buildHeap(arr);
         
        for (int i = n - 1; i > 0; i--) {
            
            int swap = arr[0];
            arr[0] = arr[i];
            arr[i] = swap;
            
            heapify(arr, 0, i);
        }
    }
	static void buildHeap(int arr[]) {
		//Construye el heap
		int n = arr.length;
		for(int i = n/2 -1; i>0; i--) {
			heapify(arr, i, n);
		}
	}
 

    static void heapify(int arr[], int idx, int max)
    {
        int largest = idx; 
        int l = 2 * idx + 1; // left = 2*i + 1
        int r = 2 * idx + 2; // right = 2*i + 2
 
        if (l < max && arr[l] > arr[idx])
            largest = l;
        if (r < max && arr[r] > arr[largest])
            largest = r;
        if (largest != idx) {
            int swap = arr[idx];
            arr[idx] = arr[largest];
            arr[largest] = swap;
 
            // recursividad
            heapify(arr, largest, max);
        }
    }
 
}
