import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,4,7,8,1,94,33};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped = false;
        //run steps n-1 times
        for (int i = 0; i < arr.length ; i++) {
            // after each step largest element is at the respective index
            for (int j = 1; j < arr.length-i; j++) {
                // swap on comparing
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you do not swap for a particular loop it means the array has got sorted so stop program
            if (!swapped){
                break;
            }

        }
    }
}
