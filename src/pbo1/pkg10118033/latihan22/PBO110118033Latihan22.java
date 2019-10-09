
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menghitung lingkaran
 *  
 */

package pbo1.pkg10118033.latihan22;

import java.util.Scanner;

public class PBO110118033Latihan22 {
    public static void main(String[] args) {
        Scanner kibord = new Scanner(System.in);
        double r, l, k;
        String d;
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai Diameter Lingkaran : ");
        d = kibord.next();
        while(!(d.matches("[0-9]*"))){
            System.out.println("Nilai Diameter tidak sesuai\n");
            System.out.print("Masukkan nilai Diameter Lingkaran : ");
            d = kibord.next();
        }
        int diamet = Integer.parseInt(d);
        
        r = diamet/2;
        l = 3.1416 * r * r;
        k = 2 * 3.1416 * r;
        System.out.println("\n===Hasil Perhitungan Lingkaran===");
        System.out.printf("Jari-jari Lingkaran : %,1.2f cm \n", r);
        System.out.printf("Luas Lingkaran      : %,1.2f cm \n", l);
        System.out.printf("Keliling Lingkaran  : %,1.2f cm \n", k);
        System.out.println("(Developed By : Ikrar AB)");
    }
}