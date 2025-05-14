import java.util.Arrays;

public class InsertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();    }

    public static void main(String args[])
    {
        int arr[] = { 3, 4, 9, 2, 5, 1, 8 };


        System.out.print("Array orginal: " + Arrays.toString(arr));

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        System.out.print("Array arrumado: " + Arrays.toString(arr));
     

       
    }
}

