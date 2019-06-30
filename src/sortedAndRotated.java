public class sortedAndRotated {


    private static void checkIfSortRotated(int[] arr, int length) {
        int min = arr[0];
        int index = -1;
        for (int i = 0; i < length - 1; i++) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
                index = i + 1;
            }
        }

        System.out.println(min + " is the minimum element and index is  " + index);
        for (int i = 0; i < index; i++) {
            if (arr[i] < arr[i + 1]) {

            }

        }


    }

    public static void main(String[] args) {
        arraySorted arraySorted = new arraySorted();

        int arr[] = {7, 9, 5, 11, 12};
        checkIfSortRotated(arr, arr.length);

    }


}
