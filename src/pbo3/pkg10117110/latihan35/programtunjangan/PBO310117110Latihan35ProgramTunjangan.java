


/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Gaji Karyawan Menggunakan Konsep OOP
 */
package pbo3.pkg10117110.latihan35.programtunjangan;

import java.util.Scanner;


public class PBO310117110Latihan35ProgramTunjangan {


    public static void main(String[] args) {
        double Gaji;
        double tunjangan;
        double totalGaji;
        String Status;
        Scanner scan = new Scanner(System.in);
        
        Gaji objGaji = new Gaji();    
        
        System.out.println("=============Program Tunjangan================");
        System.out.print("Berapa gaji pokok anda perbulan? :Rp. ");
        objGaji.gajiPokok = scan.nextDouble();        
        System.out.print("Status anda? (Menikah/Belum) : ");
        objGaji.status = scan.next();
        
        objGaji.hasilHitung(objGaji.status,objGaji.gajiPokok);

        
        
        
        
        
        
    }
    
}
