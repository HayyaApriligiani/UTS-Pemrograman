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
public class MatematikaCanggihBanget extends MatematikaCanggih{ 
    int jumlahEmpat;
    void pertambahanEmpat(int a, int b, int c, int d){
        jumlahEmpat = a+b+c+d;
        System.out.println("a + b + c + d = "+jumlahEmpat);
    }
    int getJumlahEmpat(){
    return jumlahEmpat;
    }

}
