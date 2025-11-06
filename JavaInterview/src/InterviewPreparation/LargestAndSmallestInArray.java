package InterviewPreparation;

import java.util.Arrays;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {

        int[] arr = {3,5,6,9,10,18,24,76};

        int largestNumber = arr[0];
        int smallestNumber = arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>largestNumber){
                largestNumber = arr[i];
            } else if(arr[i]<smallestNumber){
                smallestNumber = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("The Largest Element in the Array is " + largestNumber);
        System.out.println("The Smallest Element in the Array is " + smallestNumber);



    }
}
