public class contigousSum {


    // will not work for all negative numbers
    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = 0, max_ending_here = 0;

        // lokk only for positive segments of array - max_ending

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            //reseting to zero if its becomes negative
            if (max_ending_here < 0)
                max_ending_here = 0;
                // compare only when max ending here is greater than zero
            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }


    public static int KadaneWithIndices(int[] array){
        int currentMax = 0;
        int totalMax = Integer.MIN_VALUE;
        int startIndex = 0, endIndex = 0, tempIndex = 0;

        for(int i = 0; i < array.length; i++){
            currentMax += array[i];

            if(currentMax < 0){
                currentMax = 0;
                tempIndex = i + 1;
            }
            else if(totalMax < currentMax){
                totalMax = currentMax;
                startIndex = tempIndex;
                endIndex = i;

            }
        }
        System.out.println("Start index: " + startIndex + " End index: " + endIndex);
        return totalMax;
    }

    public int getMaxSubarraySum(int[] array){
        int currentMax = Integer.MIN_VALUE;
        int totalMax =  Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            currentMax = Math.max(currentMax, 0) + array[i];
            totalMax = Math.max(totalMax, currentMax);
        }
        return totalMax;
    }


    public static void main(String[] args) {
        contigousSum contigousSum = new contigousSum();
        int[] a = {11, 10, -20, 5, -3, -5, 8, -13, 10};

        int i = KadaneWithIndices(a);
        System.out.println(i);


        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));


    }
}
