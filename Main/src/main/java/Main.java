import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args){
        int myArray[] = {22,89,44,33,90,69,25};
        sort(myArray);
        System.out.print(Arrays.toString(myArray));

        int findInt = 33;
        var returnIndex = Arrays.binarySearch(myArray, findInt);
        System.out.println("returnIndex: " +returnIndex);

        if(returnIndex >= 0){
            System.out.println( findInt + "found at index " + returnIndex);
        }
        else {
            System.out.println(findInt + " Not found in array");
        }

    }
}
