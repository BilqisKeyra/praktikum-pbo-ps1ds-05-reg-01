package com.bilqis.Guided.guided03;

public abstract class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //setiap gawai pasti punya gaji dengan rumus yang berbeda-beda
    public abstract double earnings();

    //saat ada penagihan, alihkan langsung ke metode kalkulasi
    @Override
    public double getPaymentAmount() {
        return earnings();
    }


}
