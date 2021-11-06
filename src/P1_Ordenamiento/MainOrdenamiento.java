package P1_Ordenamiento;

public class MainOrdenamiento {
	
	public static void printArray(int[] arr) {
	//Metodo para imprimir el array.
		int n = arr.length;
	    for(int i = 0; i < n; i++)
	        System.out.print(arr[i] + " ");     
	    System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 7, 8, 9, 1, 5 };
	    
	    //InsertionSort.sort(arr);
	    //HeapSort.sort(arr);
	    QuickSort.sort(arr);
	      
	    
	    printArray(arr);
	}

}
