/* 
    **NOTE** jika program error mungkin bisa menghapus method clearConsole() 
    beserta pemanggilan method-nya.
    Karena sepertinya tidak bekerja untuk semua device.

    Galih Nugraha (123190122)
*/

package com;

import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repeat = true;
        boolean catchError = false;
        char forRepeat = 'y';

        while (repeat) {
            catchError = false;

            clearConsole();
             
            System.out.println("\n == MENU OPERASI ==\n");
            System.out.println("  1. Persegi");
            System.out.println("  2. Persegi Panjang");
            System.out.println("  3. Lingkaran");
            System.out.println("  4. Segitiga");
            System.out.println("  5. Kubus");
            System.out.println("  6. Balok");
            System.out.println("  7. Tabung");
            System.out.println("  8. Prisma Segitiga");
            System.out.println("  0. Exit Program\n");

            System.out.print("-> Pilih Menu : ");
            int select = 0;
            try {
                select = userInput.nextInt();
            } catch (Exception e) {
                System.out.println("\n----------------------------------------\n");
                System.err.println(" (( inputan yang anda masukan bukan angka ))");
                repeat = false;
                catchError = true;
            }
            
            if (repeat) {
                System.out.println("\n----------------------------------------\n");
                switch (select) {
                    case 1: {catchError = operasiPersegi(); break;}
                    case 2: {catchError = operasiPersegiPanjang(); break;}
                    case 3: {catchError = operasiLingkaran(); break;}
                    case 4: {catchError = operasiSegitiga(); break;}
                    case 5: {catchError = operasiKubus(); break;}
                    case 6: {catchError = operasiBalok(); break;}
                    case 7: {catchError = operasiTabung(); break;} 
                    case 8: {catchError = operasiPrisma(); break;} 
                    
                    case 0: {
                        System.out.println(" (( Exit Program ))");
                        System.exit(0);
                    }

                    default: {
                        System.err.println(" (( inputan yang anda masukan salah ))");
                        break;
                    }   
                }
            }
            System.out.println("\n----------------------------------------");
            System.out.print("\n-> Ulangi Program? (y/n) : ");
            forRepeat = userInput.next().charAt(0);

            if (catchError) {
                forRepeat = userInput.next().charAt(0);
            }

            if (forRepeat == 'y') {
                repeat = true;
            } else {
                repeat = false;
            }
        }
        
        System.out.println("\n (( Exit Program ))");
    }

    public static boolean operasiPersegi() {
        boolean catchError = false;
        int sisi = 0; 
        
        try {
            System.out.print(" -> Masukan sisi persegi (cm) : ");
            sisi = userInput.nextInt();
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            BangunDatar persegi = new Persegi(sisi);
            persegi.display();
        }

        return catchError;
    }

    public static boolean operasiPersegiPanjang() {
        boolean catchError = false;
        int panjang = 0, lebar = 0;

        try {
            System.out.print(" -> Masukan panjang persegi panjang (cm) : ");
            panjang = userInput.nextInt();
            System.out.print(" -> Masukan lebar persegi panjang (cm)   : ");
            lebar = userInput.nextInt();
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            BangunDatar persegiPanjang = new PersegiPanjang(panjang, lebar);
            persegiPanjang.display();
        }

        return catchError;
    }

    public static boolean operasiLingkaran() {
        boolean catchError = false;
        int jariJari = 0; 
        
        try {
            System.out.print(" -> Masukan jariJari lingkaran (cm) : ");
            jariJari = userInput.nextInt();
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            BangunDatar lingkaran = new Lingkaran(jariJari);
            lingkaran.display();
        }

        return catchError;
    }

    public static boolean operasiSegitiga() {
        boolean catchError = false;
        int alas = 0, tinggi = 0;

        try {
            System.out.print(" -> Masukan alas segitiga (cm)   : ");
            alas = userInput.nextInt();
            System.out.print(" -> Masukan tinggi segitiga (cm) : ");
            tinggi = userInput.nextInt();
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            BangunDatar segitiga = new Segitiga(alas, tinggi);
            segitiga.display();
        }

        return catchError;
    }

    public static boolean operasiKubus() {
        boolean catchError = false;
        int sisi = 0; 
        
        try {
            System.out.print(" -> Masukan sisi kubus (cm) : ");
            sisi = userInput.nextInt();
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            BangunRuang kubus = new Kubus(sisi);
            kubus.display();
        }

        return catchError;
    }

    public static boolean operasiBalok() {
        boolean catchError = false;
        int panjang = 0, lebar = 0, tinggi = 0;

        try {
            System.out.print(" -> Masukan panjang balok (cm) : ");
            panjang = userInput.nextInt();
            System.out.print(" -> Masukan lebar balok (cm)   : ");
            lebar = userInput.nextInt();
            System.out.print(" -> Masukan tinggi balok (cm)  : ");
            tinggi = userInput.nextInt();
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            BangunRuang balok = new Balok(panjang, lebar, tinggi);
            balok.display();
        }

        return catchError;
    }

    public static boolean operasiTabung() {
        boolean catchError = false;
        int jariJari = 0, tinggi = 0;

        try {
            System.out.print(" -> Masukan jari-jari alas tabung (cm) : ");
            jariJari = userInput.nextInt();
            System.out.print(" -> Masukan tinggi tabung (cm)         : ");
            tinggi = userInput.nextInt();
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            BangunRuang tabung = new Tabung(jariJari, tinggi);
            tabung.display();
        }

        return catchError;
    }

    public static boolean operasiPrisma() {
        boolean catchError = false;
        int lebarAlas = 0, tinggiAlas = 0, tinggiPrisma = 0;

        try {
            System.out.print(" -> Masukan lebar alas prisma segitiga (cm)  : ");
            lebarAlas = userInput.nextInt();
            System.out.print(" -> Masukan tinggi alas prisma segitiga (cm) : ");
            tinggiAlas = userInput.nextInt();
            System.out.print(" -> Masukan tinggi prisma segitiga (cm)      : ");
            tinggiPrisma = userInput.nextInt();
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            BangunRuang prisma = new Prisma(lebarAlas, tinggiAlas, tinggiPrisma);
            prisma.display();
        }

        return catchError;
    }

    public final static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
