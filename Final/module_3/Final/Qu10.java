//Write a program, to demonstrate nested try-catch-finally structure.

import java.io.*;
public class Qu10 {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception");
            }
            try {
                int[] a = new int[5];
                a[10] = 10;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds Exception");
            }
        } catch (Exception e) {
            System.out.println("Parent Exception");
        } finally {
            System.out.println("Finally Block");
        }
    }
}