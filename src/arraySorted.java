public class arraySorted
{


    static boolean checkIfSortRotated(int[] arr,
                                      int n)
    {
        for (int i = 0 ; i < n -1 ; i++)
        {
            if (arr[i+1] == arr[i] ||  arr[i+1] > arr[i])
            {
                int num = arr[i+1];
                int num1 = arr[i];
               continue;
            }
            else {
                System.out.println("array is not sorted");
                return false;
            }
        }
        return false ;
    }



        public static void main(String[] args) {
        arraySorted arraySorted = new arraySorted();

        int arr[] = {7,7,9, 11, 12};
        checkIfSortRotated(arr,arr.length);

    }
}
