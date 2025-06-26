package day22_array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int maxNum = -2147483648;
        int minNum = 2147483647;
        

        // NOTE: Some other utility classes
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);

        System.out.print("Please, tell me how many numbers do you want to compare: ");

        int [] nums = new int[ key.nextInt() ]; //5

        for (int i = 0; i < nums.length; i++) { //5
            System.out.print("Please, enter num: ");
            nums [i] = key.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(nums));

        for ( int eachElem : nums ){
            if (eachElem > maxNum){
                maxNum = eachElem;
            }

            if (eachElem < minNum){
                minNum = eachElem;
            }
        }

        System.out.println(" maxNum = " +  maxNum);
        System.out.println(" minNum= " + minNum);




    }
}
