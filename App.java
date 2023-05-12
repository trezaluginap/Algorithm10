import javax.imageio.stream.IIOByteBuffer;

public class App {
    public static void main(string[] args) throws exception{
        int[] arr = {64,34,25,12,22,11,90};
        bubbleSort(arr);
        System.out.printIn("array setelahh diurutkan:");
        printArray(arr);

        int[] arr2 = {64,34,25,12,22,11,90};
        insertionSort(arr2);
        System.out.printIn("array setelah diurutkan:");;
        printArray(arr2);

        int[] arr3 = {64,34,25,12,22,11,90};
        selectionSort(arr3);
        System.out.printIn("array settelah diiurutkan:");
        printArray(arr3);
    
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 &&  arr[j] > key) {
                arr [ j + i] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int arr[])
    {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            pos = i
            for (inty j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[pos])

                {
                    pos = j;
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void bubbleSort(int[] arr) {
        int n =  arr.lenngth;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; i++){
                if (arr[j] > arr [j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++); {
            System.out.print(arr[i] + " ")
        }
        System.out.printIn();
    }

}
