import java.util.Arrays;

public class nextGreaterElement {
    public static int[] findNextGreater(int[] arr, int index) {
        
        if (index == arr.length) {
            return new int[arr.length]; 
        }

        int[] result = findNextGreater(arr, index + 1);

        result[index] = -1; 
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] > arr[index]) {
                result[index] = arr[j];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] result = findNextGreater(arr,0);
        System.out.println(Arrays.toString(result));
    }
}
