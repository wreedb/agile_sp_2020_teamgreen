/**
 * 
 */
package edu.cvtc.java;

/**
 * @author david.kittle
 *
 */
import java.util.Scanner;

public class ObjectMain {

    public static void main(String[] args) {
        Integer testOne;
        Integer testTwo;
        Integer testThree;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value on testOne  ");
        testOne = input.nextInt();
        System.out.print("Enter the value of testTwo ");
        testTwo = input.nextInt();
        System.out.print("Enter the value of testThree ");
        testThree = input.nextInt();



        ObjectOne objOne = new ObjectOne(testOne, testTwo);
        ObjectTwo objTwo = new ObjectTwo (testOne, testTwo, testThree);

        System.out.println("Obj 1 is "+ objOne.getTestOne());
        System.out.println("Obj 2 is "+ objOne.getTestTwo());
        System.out.println ("Obj 3 os " + objTwo.sumOfTest(testOne, testTwo, testThree));


    }
}

