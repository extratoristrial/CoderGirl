package com.company;

public class lettersToNumbers {

    public static void main(String[] args) {

        int[] nums = {89,111,117,39,114,101,32,97,32,115,116,97,114,33};
        for (int index = 0; index < nums.length; index++) {
            char printLetter = (char)nums[index];
            System.out.print(printLetter);
        }
        System.out.println("\n");

        char[] letters = {'C','r','o','w',' ','f','l','i','e','s',' ','a','t',' ','d','a','w','n','.'};
        for (int index2 = 0; index2 < letters.length; index2++) {
            int printNumber = (int)letters[index2];
            System.out.print(printNumber + ",");
        }

    }

}
