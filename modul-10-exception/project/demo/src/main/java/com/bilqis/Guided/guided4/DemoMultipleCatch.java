package com.bilqis.Guided.guided4;

public class DemoMultipleCatch {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 100/x;

            int[] arr = {10,11};
            y = arr[x];

            System.out.println("Tidak ada eksepsi");
        } catch (ArithmeticException e) {
            //TODO: HANDLE EXCEPTION
            System.out.println("Execption karena gabisa dibagi dengan 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi index array tidak valid");
        }
        System.out.println("Program selesai");
    }
}
