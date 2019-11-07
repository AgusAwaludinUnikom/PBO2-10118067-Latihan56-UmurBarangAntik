/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan56.umurbarangantik;

/**
 *
 * @author
 * NAMA : Agus Awaludin
 * NIM : 10118067
 * KELAS : PBO2
 * Latihan ini berisi tentang cara menampilkan data barang antik dengan metode
 * polymorpism
 */
public class PBO210118067Latihan56UmurBarangAntik {
    
    public static String name;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        
        System.out.println("Nama Barang antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}
