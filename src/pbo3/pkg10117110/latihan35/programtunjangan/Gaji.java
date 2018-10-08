
package pbo3.pkg10117110.latihan35.programtunjangan;



public class Gaji {
   public double tunjangan,gajiPokok;
   public String status;
 
   
   public double hitungTunjangan(String varstatus, double  vargajiPokok){
       return tunjangan =(varstatus.equals("Menikah")?0.35*vargajiPokok:0);
       
   }
   public double hitungTotalGaji(double vargajiPokok, double vartunjangan){
       return tunjangan = vartunjangan + vargajiPokok;
        
    }
   
   public void hasilHitung(String varstatus, double vargajiPokok){
        System.out.println("");
        System.out.println("");
        System.out.println("--------Hasil Perhitungan Gaji Anda--------------");
        System.out.println("Gaji Pokok\t: " +gajiPokok);
        System.out.println("Tunjangan\t: " +hitungTunjangan(varstatus,vargajiPokok));
        System.out.println("Total Gaji\t: " +hitungTotalGaji(vargajiPokok,tunjangan));
        System.out.println("Developed by: Fauzi Sunarya");
   }
    
}
