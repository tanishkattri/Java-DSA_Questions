import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,4,7,1,9,3,6,10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find max replace with last
            int last = arr.length-i-1;
            int max = getMaxIndex(arr , 0, last);
            swap(arr, max, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
