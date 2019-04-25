import java.util.Arrays;

public class DifferenceOfValues {
    public static void main(String[] args) {
        Integer[] array = {6,7,4,10,2,15,16};
        DifferenceOfValues differenceOfValues = new DifferenceOfValues();
        differenceOfValues.findingLessdiffernce(array);

    }
    public Integer findingLessdiffernce(Integer[] array) {

        Integer diff ;
        Arrays.sort(array);
        System.out.println("Completely Sorted: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            Integer diff1 = array[i + 1] - array[i];
            //System.out.println();
            if ( diff1 > 0) {
                diff = diff1;
                System.out.println(diff);
            }
                return diff1;
            }

       // System.out.println(diff1);
        return 0;
    }

}
