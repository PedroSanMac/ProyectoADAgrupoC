package P1_Ordenamiento;

public class InsertionSort {
	//Algoritmo para ordenar un arreglo mediante insercion.
    public static void sort(int arr[]){
    	//recorre todo el arreglo desde la posicion 1 porque la pos 0 ya esta ordenado
    	//busca donde insertar cada elemento.
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
        	insert(arr, i, arr[i]);
        }
    }
    static void insert(int arr[], int pos, int value) {
    	//recorre la parte ordenada hasta encontrar el elemento pos i es menor y lo inserta.
    	int i = pos - 1;
    	while(i >= 0 && arr[i] > value) {
    		arr[i+1]=arr[i];
    		i--;
    	}
    	arr[i+1]=value;
    }
}
