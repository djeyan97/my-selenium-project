package InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofOccurence {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        String str = "I Love Java and Love Java Programming";
        Integer count = 1;
        String[] arr =  str.split(" ");

        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            } else  {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        for(String x :map.keySet()){
            System.out.println("The Count of the word " + x + " is " + map.get(x));
        }

    }



}
