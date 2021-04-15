package com;

public abstract class BangunRuang {
    private double hitungKelilingAlas() {
        return 0;
    }
    private double hitungLuasPermukaan() {
        return 0;
    }
  
    protected abstract double hitungLuasAlas();
    protected abstract double hitungVolume();

    public abstract void display();

}

class Kubus extends BangunRuang {
    private int sisi;

    Kubus(int sisi) {
        this.sisi = sisi;
    }

    public void display() {
        System.out.println("\n   ** MENGHITUNG KUBUS **\n");
        System.out.println("  Luas Alas Kubus      = " + hitungLuasAlas() + " cm2");
        System.out.println("  Keliling Alas Kubus  = " + hitungKelilingAlas() + " cm");
        System.out.println("  Volume Kubus         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Kubus = " + hitungLuasPermukaan() + " cm2");
    }

    private double hitungKelilingAlas() {
        return 4 * this.sisi;
    }

    protected double hitungLuasAlas() {
        return this.sisi * this.sisi;
    }

    protected double hitungVolume() {
        return this.sisi * this.sisi * this.sisi;
    }

    private double hitungLuasPermukaan() {
        return 6 * this.hitungLuasAlas();
    }
}

class Balok extends BangunRuang {
    private int panjang;
    private int lebar;
    private int tinggi;

    Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void display() {
        System.out.println("\n   ** MENGHITUNG BALOK **\n");
        System.out.println("  Luas Alas Balok      = " + hitungLuasAlas() + " cm2");
        System.out.println("  Keliling Alas Balok  = " + hitungKelilingAlas() + " cm");
        System.out.println("  Volume Balok         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Balok = " + hitungLuasPermukaan() + " cm2");
    }

    private double hitungKelilingAlas() {
        return (2 * this.panjang) + (2 * this.lebar);
    }

    protected double hitungLuasAlas() {
        return this.panjang * this.lebar;
    }

    protected double hitungVolume() {
        return this.hitungLuasAlas() * this.tinggi;
    }

    private double hitungLuasPermukaan() {
        double alas = 2 * hitungLuasAlas();
        double muka = 2 * this.panjang * this.tinggi;
        double samping = 2 * this.lebar * this.tinggi;
        
        return alas + muka + samping;
    }
}

class Tabung extends BangunRuang {
    private int jariJari;
    private int tinggi;

    Tabung(int jariJari, int tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public void display() {
        System.out.println("\n   ** MENGHITUNG TABUNG **\n");
        System.out.println("  Luas Alas Tabung      = " + hitungLuasAlas() + " cm2");
        System.out.println("  Keliling Alas Tabung  = " + hitungKelilingAlas() + " cm");
        System.out.println("  Volume Tabung         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Tabung = " + hitungLuasPermukaan() + " cm2");
    }

    private double hitungKelilingAlas() {
        return 2 * Math.PI * this.jariJari;
    }

    protected double hitungLuasAlas() {
        return Math.PI * this.jariJari * this.jariJari;
    }

    protected double hitungVolume() {
        return this.hitungLuasAlas() * this.tinggi;
    }

    private double hitungLuasPermukaan() {
        double x = this.jariJari + this.tinggi;
        return 2 * Math.PI * this.jariJari * x;
    }
}

class Prisma extends BangunRuang {
    private int lebarAlas;
    private int tinggiAlas;
    private int tinggiPrisma;

    Prisma(int lebarAlas, int tinggiAlas, int tinggiPrisma) {
        this.lebarAlas= lebarAlas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public void display() {
        System.out.println("\n   ** MENGHITUNG PRISMA SEGITIGA **\n");
        System.out.println("  Luas Alas Prisma Segitiga = " + hitungLuasAlas() + " cm2");
        System.out.println("  Volume Prisma Segitiga    = " + hitungVolume() + " cm3");
    }

    protected double hitungLuasAlas() {
        return (this.lebarAlas * this.tinggiAlas) / 2;
    }

    protected double hitungVolume() {
        return this.hitungLuasAlas() * this.tinggiPrisma;
    }
}
