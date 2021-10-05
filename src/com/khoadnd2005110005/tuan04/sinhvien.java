package com.khoadnd2005110005.tuan04;

import java.io.PrintStream;

public class sinhvien {

/**
     *
     */
    private static final PrintStream OUT = System.out;
String name;
int MSSV;

sinhvien(){};

sinhvien(int s, String n){
    MSSV = s;
    name = n;
}

void inThongTin() {
    System.println("MSSV = " + MSSV + " " + " Name = " + name +);
}

}
