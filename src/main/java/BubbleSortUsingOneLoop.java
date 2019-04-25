import java.util.Arrays;

public class BubbleSortUsingOneLoop {

    public static boolean shouldSwap(Integer a, Integer b) {

        return (a > b) ? true : false;
    }

    public Integer[] bubbleSort(Integer[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] > arr[i+1]) {
                BubbleSortUsingOneLoop.shouldSwap(arr[i], arr[i+1]);
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSortUsingOneLoop bubbleSortUsingOneLoop = new BubbleSortUsingOneLoop();
        Integer[] inputArray = {5, 9, 3,1};
        bubbleSortUsingOneLoop.bubbleSort(inputArray);
    }
}
