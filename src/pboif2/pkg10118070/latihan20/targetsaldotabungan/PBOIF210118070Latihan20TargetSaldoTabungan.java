/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan20.targetsaldotabungan;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class PBOIF210118070Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i,total,bunga;
        total=3500000;
        bunga= (int) (total*0.08);
        total=total+bunga;
        i=1;
        do{
            System.out.println("Saldo di bulan ke-" + i + " Rp " + total);
            i++;
            bunga= (int) (total *0.08);
            total +=bunga;
        }while (i<=8);
        System.out.println("(Developed by : Aufa Ilyasha)");
    }
    
}
