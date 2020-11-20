/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan59.detectiveconan;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan daftar karakter detective conan
 */
public class IF110119028Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karakter karakter1, karakter2, karakter3, karakter4, karakter5, karakter6;
        Karakter karakter7, karakter8, karakter9, karakter10, karakter11, karakter12;
        
        System.out.println("======Karakter di Detective Conan======");
        karakter1 = new Karakter();
        karakter1.setNama("Conan Edogawa");
        karakter1.setUmur(7);
        karakter1.setKepribadian("Cerdas");
        karakter1.setRole("Pemain Utama");
        karakter1.tampilKarakter();
        
        karakter2 = new Karakter();
        karakter2.setNama("Mitsuhiko Tsuburaya");
        karakter2.setUmur(7);
        karakter2.setKepribadian("Cerdas");
        karakter2.setRole("Anggota Detective Boys");
        karakter2.tampilKarakter();
        
        karakter3 = new Karakter();
        karakter3.setNama("Ai Haibara");
        karakter3.setUmur(7);
        karakter3.setKepribadian("Cerdas, Tenang");
        karakter3.setRole("Anggota Detective Boys");
        karakter3.tampilKarakter();
        
        karakter4 = new Karakter();
        karakter4.setNama("Ayumi Yoshida");
        karakter4.setUmur(7);
        karakter4.setKepribadian("Ceria");
        karakter4.setRole("Anggota Detective Boys");
        karakter4.tampilKarakter();
        
        karakter5 = new Karakter();
        karakter5.setNama("Genta Kojima");
        karakter5.setUmur(7);
        karakter5.setKepribadian("Kurang ajar");
        karakter5.setRole("Anggota Detective Boys");
        karakter5.tampilKarakter();
        
        karakter6 = new Karakter();
        karakter6.setNama("Kogoro Mouri");
        karakter6.setUmur(38);
        karakter6.setKepribadian("Gegabah, Pemalas");
        karakter6.setRole("Ayah dari Ran Mouri");
        karakter6.tampilKarakter();
        
        karakter7 = new Karakter();
        karakter7.setNama("Ran Mouri");
        karakter7.setUmur(17);
        karakter7.setKepribadian("Cerdas, Baik, Penyabar");
        karakter7.setRole("Putri dari Kogoro Mouri");
        karakter7.tampilKarakter();
        
        karakter8 = new Karakter();
        karakter8.setNama("Sonoko Suzuki");
        karakter8.setUmur(17);
        karakter8.setKepribadian("Gegabah, Temperamental");
        karakter8.setRole("Sahabat dari Ran Mouri");
        karakter8.tampilKarakter();
        
        karakter9 = new Karakter();
        karakter9.setNama("Eri Kisaki");
        karakter9.setUmur(38);
        karakter9.setKepribadian("Cerdas");
        karakter9.setRole("Ibu Dari Ran Mouri");
        karakter9.tampilKarakter();
        
        karakter10 = new Karakter();
        karakter10.setNama("Heiji Hattori");
        karakter10.setUmur(17);
        karakter10.setKepribadian("Tenang, Periang");
        karakter10.setRole("Rival dari Shinichi Kudo (Conan Edogawa Versi Dewasa)");
        karakter10.tampilKarakter();
        
        karakter11 = new Karakter();
        karakter11.setNama("Kazuha Toyama");
        karakter11.setUmur(17);
        karakter11.setKepribadian("Temperamental, Cerdas");
        karakter11.setRole("Sahabat dari Heiji Hattori");
        karakter11.tampilKarakter();
        
        karakter12 = new Karakter();
        karakter12.setNama("Hiroshi Agasa");
        karakter12.setUmur(53);
        karakter12.setKepribadian("Periang, Ramah");
        karakter12.setRole("Professor");
        karakter12.tampilKarakter();
        
    }
    
}
