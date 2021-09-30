/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbandingan;

/**
 *
 * @author dini aryani
 */
public class OperatorPerbandinganNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilai_awal = 80;
        int nilai_akhir =70;
        boolean isTerbesar;
        
        isTerbesar = nilai_awal > nilai_akhir;
        System.out.println("Apakah " + nilai_awal + "lebih besar dari " + nilai_akhir + "?" + isTerbesar);
        
        isTerbesar = nilai_awal < nilai_akhir;
        System.out.println("Apakah " + nilai_awal + "lebih kecil dari " + nilai_akhir + "?" + isTerbesar);
  
    }
    
}
