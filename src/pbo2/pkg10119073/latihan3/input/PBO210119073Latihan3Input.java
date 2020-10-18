package pbo2.pkg10119073.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk memasukkan nilai
 * keyboard
 *
 */
public class PBO210119073Latihan3Input {

    public static void main(String[] args) {
        System.out.print("Masukkan nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda adalah "+nama);
    }
    
}
