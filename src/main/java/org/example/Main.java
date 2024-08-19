package org.example;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Step 1
        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; //Step 4
        int [] numbers3 = new int [numbers.length]; //Step 5
        int sum = 0; // Step 2
        int largest = numbers[0]; //Step 3

        // Schleife Step 1 & 2
        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(numbers[i]);
            sum = sum + numbers[i];
            System.out.println(sum);
        }

        // Schleife Step 3
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number in the Array is " + largest);

        //Step 5
        System.out.println("Das ist der neue Array number3: ");

        // Perform element-wise addition
        for (int i = 0; i < numbers.length; i++) {
            numbers3[i] = numbers[i] + numbers2[i];
        }
        // Print the result array to the console
        System.out.print("Result of element-wise addition: ");
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
    }
    }