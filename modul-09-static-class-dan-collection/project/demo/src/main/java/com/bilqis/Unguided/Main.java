package com.bilqis.Unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ModelEksperimen> daftarModel = new ArrayList<>();

        daftarModel.add(new ModelEksperimen("Logistic Regression", 0.82, 12));
        daftarModel.add(new ModelEksperimen("Random Forest", 0.91, 45));
        daftarModel.add(new ModelEksperimen("SVM", 0.87, 60));
        daftarModel.add(new ModelEksperimen("KNN", 0.79, 5));
        daftarModel.add(new ModelEksperimen("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen
        System.out.println("Jumlah eksperimen: " + ModelEksperimen.getJumlahEksperimen());

        // 2. Sort by akurasi (Comparable)
        System.out.println("\nSorted by akurasi");
        List<ModelEksperimen> byAkurasi = new ArrayList<>(daftarModel);
        Collections.sort(byAkurasi);
        byAkurasi.forEach(System.out::println);

        // 3. Sort by waktu training (Comparator)
        System.out.println("\nSorted by waktu training");
        List<ModelEksperimen> byWaktu = new ArrayList<>(daftarModel);
        Collections.sort(byWaktu, new WaktuComparator());
        byWaktu.forEach(System.out::println);

        // 4. Filtering akurasi >= 0.85 (lambda)
        System.out.println("\nModel dengan akurasi minimal 0.85");
        List<ModelEksperimen> filtered = daftarModel.stream()
                .filter(m -> m.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);

        // 5. Pencarian "KNN" (lambda)
        System.out.println("\nPencarian model KNN");
        ModelEksperimen knn = daftarModel.stream()
                .filter(m -> m.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(knn);
    }
}