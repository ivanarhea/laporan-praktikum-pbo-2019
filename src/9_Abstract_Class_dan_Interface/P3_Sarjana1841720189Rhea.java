/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhea Ivana
 */
public class P3_Sarjana1841720189Rhea extends P3_Mahasiswa1841720189Rhea implements P3_ICumlaude1841720189Rhea,P3_IBerprestasi1841720189Rhea{
    public P3_Sarjana1841720189Rhea(String nama) {
        super(nama);
    }
    
    @Override
    public void lulusRhea() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiRhea() {
        System.out.println("IPK-ku lebih dari 3,51");  
    }

    @Override
    public void menjuaraiKompetisiRhea() {
        System.out.println("AUTO JUARA DUNIA DONGGG");    }

    @Override
    public void membuatPublikasiIlmiahRhea() {
        System.out.println("Saya telah menerbitkan Jurnalisa Kelas INTERNASIONAL");
    }
    
}
