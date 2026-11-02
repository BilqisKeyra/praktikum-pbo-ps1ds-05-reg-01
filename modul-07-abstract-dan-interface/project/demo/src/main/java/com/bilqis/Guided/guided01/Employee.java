package com.bilqis.Guided.guided01;

public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }

    // setiap pegawai pasti punya gaji tapi rumusnya berbeda
    public abstract double earnings();
}