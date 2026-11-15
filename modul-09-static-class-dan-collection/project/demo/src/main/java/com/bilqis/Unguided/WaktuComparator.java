package com.bilqis.Unguided;

import java.util.Comparator;

public class WaktuComparator implements Comparator<ModelEksperimen> {
    @Override
    public int compare(ModelEksperimen m1, ModelEksperimen m2) {
        // Waktu tercepat ke terlama
        return Integer.compare(m1.getWaktuTraining(), m2.getWaktuTraining());
    }
}