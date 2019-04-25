import java.util.Arrays;

public class Bubble {

        public Integer[] bubble(Integer[] arr) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {

                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.println(Arrays.toString(arr));
            return arr;
        }

        public static void main(String[] args) {
            Bubble ob = new Bubble();
            Integer[] newarr = {9, 4, 7, 1, 2, 0};
            ob.bubble(newarr);
        }
    }


