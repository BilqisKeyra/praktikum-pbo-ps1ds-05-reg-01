package com.Unguided;

public interface ItemTransaksi {
    double getNominalBayar();

    String getNamaTransaksi();

    // Default Method
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Static Method
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}