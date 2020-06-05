package test;

import domain.Exercise;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите величину массива: ");
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            arr[i] = in.nextInt();
        }
        System.out.println("Второе по величене число = "+Exercise.Calculate(arr));
    }
}
