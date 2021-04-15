package com;

public abstract class BangunDatar {
    private double hitungKeliling() {
        return 0;
    }

    protected abstract double hitungLuas();

    public abstract void display();
}

class Persegi extends BangunDatar {
    private int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void display() {
        System.out.println("\n   ** MENGHITUNG PERSEGI **\n");
        System.out.println("  Luas Persegi     = " + hitungLuas() + " cm2");
        System.out.println("  Keliling Persegi = " + hitungKeliling() + " cm");
    }

    private double hitungKeliling() {
        return 4 * this.sisi;
    }

    protected double hitungLuas() {
        return this.sisi * this.sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;

    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void display() {
        System.out.println("\n   ** MENGHITUNG PERSEGI PANJANG **\n");
        System.out.println("  Luas Persegi Panjang     = " + hitungLuas() + " cm2");
        System.out.println("  Keliling Persegi Panjang = " + hitungKeliling() + " cm");
    }

    private double hitungKeliling() {
        return (2 * this.panjang) + (2 * this.lebar);
    }

    protected double hitungLuas() {
        return this.panjang * this.lebar;
    }
}

class Lingkaran extends BangunDatar {
    private int jariJari;

    Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public void display() {
        System.out.println("\n   ** MENGHITUNG LINGKARAN **\n");
        System.out.println("  Luas Lingkaran     = " + hitungLuas() + " cm2");
        System.out.println("  Keliling Lingkaran = " + hitungKeliling() + " cm");
    }

    private double hitungKeliling() {
        return 2 * Math.PI * this.jariJari;
    }

    protected double hitungLuas() {
        return Math.PI * this.jariJari * this.jariJari;
    }
}

class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void display() {
        System.out.println("\n   ** MENGHITUNG SEGITIGA **\n");
        System.out.println("  Luas Segitiga = " + hitungLuas() + " cm2");
    }

    protected double hitungLuas() {
        return (this.alas * this.tinggi) / 2;
    }
}