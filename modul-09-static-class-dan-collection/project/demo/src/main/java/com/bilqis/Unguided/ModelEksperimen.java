package com.bilqis.Unguided;

public class ModelEksperimen implements Comparable<ModelEksperimen> {
    private String namaModel;
    private double akurasi;
    private int waktuTraining;

    // Static counter
    private static int jumlahEksperimen = 0;

    public ModelEksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    // Getter
    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Static method
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }

    // Default sorting: akurasi tertinggi ke terendah
    @Override
    public int compareTo(ModelEksperimen other) {
        return Double.compare(other.akurasi, this.akurasi);
    }
}
