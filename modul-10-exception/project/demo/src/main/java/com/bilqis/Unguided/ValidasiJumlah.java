package com.bilqis.Unguided;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidasiJumlah {
    
    public static void cekJumlah(int qty) throws Exception {
        if (qty <= 0) {
            throw new Exception("Jumlah barang minimal harus 1.");
        } else {
            System.out.println("Jumlah barang valid: " + qty + " pcs.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang dibeli: ");

        try {
            int qty = scanner.nextInt();
            cekJumlah(qty);
        } catch (Exception e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Masukkan jumlah dalam bentuk angka.");
        }
        
        scanner.close();
    }
}