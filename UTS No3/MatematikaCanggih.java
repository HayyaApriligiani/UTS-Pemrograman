/*
 * //Nama   : Hayya Apriligiani Mutiara Riadi
 * //Nim    : 11200930000003
 * //Kelas  : 2A - Sistem Informasi
 */
package MatematikaCanggih;

/**
 *
 * @author Hayya AM Riadi
 */
public class MatematikaCanggih {
    int jumlah;
    int kali;
    int modulus;
    
    void pertambahan(int a, int b){
        jumlah = a + b;
        System.out.println("a + b = "+jumlah);
    }
    
    int getTambah(){
        return jumlah;
    }
    
    void perkalian(int a, int b){
        kali = a * b;
        System.out.println("a * b = "+kali);
    }
    
     int getKali(){
        return kali;
    }
     
     void modulus(int a, int b){
         modulus = a % b;
         System.out.println("a % b = "+modulus);
    }
     
     int getModulus(){
         return modulus;
     }
}
