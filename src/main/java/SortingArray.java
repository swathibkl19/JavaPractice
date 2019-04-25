import java.util.Arrays;

public class SortingArray {

    public static Integer[] sortArray(Integer[] arr){

        Arrays.sort(arr);
        String newarr = Arrays.toString(arr);

        System.out.println("Completely Sorted: " + newarr);

        return arr;


    }

    public static void main(String[] args) {
        Integer[] arr1 = {2,9,1,5,3};
        SortingArray sortingArray = new SortingArray();
        sortingArray.sortArray(arr1);


    }


}
