package sem_interacao;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 11, 1, 8, 12, 0, 90};
        System.out.println("Algoritmo antes do bubbleSort! ");
        for (int value: arr) {
            System.out.println(value +" ");
        }

        bubbleSort(arr);
        System.out.println("\nAlgoritmo ordenado! ");
        for (int value : arr) {
            System.out.println(value +" ");
        }
    }
}
