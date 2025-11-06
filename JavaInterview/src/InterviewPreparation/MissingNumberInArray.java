package InterviewPreparation;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};

        int Sum = 0;
        int ExpectedSum = 0;

        for(int i=0; i<arr.length; i++){
            Sum+=arr[i];
        }

        //1,2,3,4,5,6,7,8,9
        //0,1,2,3,4,5,6,7,8

        for(int i=0; i <=10; i++){
            ExpectedSum+=i;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("The Missing Number in the Array is: " + (ExpectedSum - Sum));
    }
}

