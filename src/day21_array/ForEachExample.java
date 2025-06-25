package day21_array;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        
        int [] nums = {4, 24, 6, 2};
        // num.lenght --> 4
        
        // fori loop / traditional for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("----------------");
        int [] num2 = new int[5]; // [10, 10, 10, 10, 10]

        // Loop through and assign 10 to all index

        for (int i = 0; i < num2.length; i++) {
            num2[i] = 10;
        }


        System.out.println("----------------");
        // foreach loop
        // - if you do not need specific index
        // - if you need to get all the elements from beginning all the way to the end
        // {4, 24, 6, 2}
        // 1 - int eachElement = 4;
        // 2 - int eachElement = 24
        // 3 - int eachElement = 6;
        // 4 - int eachElement = 2;

        for ( int eachElement : nums) {
            System.out.println(eachElement);
           // eachElement = 30; // This does not RE ASSing values to indexes in array
        }
        System.out.println( Arrays.toString(nums) );

        System.out.println("----------------");

        String [] names = {"Tom", "Jim", "Jack"};

        for (String  eachElem: names){
            System.out.println(eachElem.toUpperCase());

        }


    }
}
