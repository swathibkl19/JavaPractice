import java.util.Arrays;


public class FindDuplicates {

    public Integer[] findDuplicate(Integer[] arr){

        Integer[] newArray = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                 if ((arr[i] == arr[j])) {
                     for (int k = 0; k < newArray.length; k++) {
                         if(newArray[k] != arr[i] ){
                             //System.out.println(newArray[k]);
                             newArray[i] = arr[i];
                         }
                     }}}}

       // Arrays.asList(newArray).removeAll(Collections.singleton(null));

        System.out.println(Arrays.toString(newArray));
        deleteNull(newArray);
        return newArray;
    }

    public static Integer[]  deleteNull(Integer[] removeNull) {

        int count = 0;
        for (int i = 0; i <removeNull.length ; i++) {
            if(removeNull[i] != null){
                count++;
            }
        }
        Integer[] newArray = new  Integer[count];
        Integer count1 = 0;
        for (int i = 0; i < removeNull.length; i++) {
            if(removeNull[i] != null){
                newArray [count1] = removeNull[i];
                count1 ++;
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static void main(String[] args) {
        FindDuplicates findDuplicates = new FindDuplicates();
        Integer[] inputArray = {1,5,5,2,7,5,7};
        findDuplicates.findDuplicate(inputArray);

    }
}
