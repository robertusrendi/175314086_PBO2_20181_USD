/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Main1 {
    
    public static void main(String[] args) {
        Pasien ps1 = new Pasien();
        Pasien ps2 = new Pasien();
        Dokter dk = new Dokter();
        AntrianPasien antre = new AntrianPasien();
        Klinik klinik = new Klinik("NT70", "Netto");
        
        try {
            ps1.setNama("Gisella Berta");
            ps1.setTempatLahir("Sleman");
            ps1.setAlamat("Jalan Godean km 7, Sleman, YK");
            ps1.setTanggalLahir(1);
            ps1.setBulanLahir(1);
            ps1.setTahunLahir(1999);
            ps2.setNama("Silvia Hadisantosa");
            ps2.setTempatLahir("Purwokerto");
            ps2.setAlamat("Jalan Damai km 14, Bantul, YK");
            ps2.setTanggalLahir(1);
            ps2.setBulanLahir(1);
            ps2.setTahunLahir(1997);
            
            dk.setNama("Joko Ludrug");
            dk.setAlamat("Jalan Bantul km 6, Bantul, YK");
            dk.setNomorPegawai("175314086");
            dk.setTempatLahir("Bandung");
            dk.setTanggalLahir(17);
            dk.setBulanLahir(8);
            dk.setTahunLahir(1983);
            
            antre.Mendaftar(ps1);
            antre.Mendaftar(ps2);
            antre.setKlinik(klinik);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(antre.getKlinik().getNama());
        System.out.println("ID KLINIK : " + antre.getKlinik().getIdKlinik());
        System.out.println("");
        
        for (int i = 0; i < antre.getDaftarPasien().size(); i++) {
            antre.TanggalAntrian();
            System.out.println("Pasien " + "ke-" +(i+1) +" " + antre.getDaftarPasien().get(i).getNama());
            System.out.println("");
            System.out.print("                 ");
            System.out.println("-DATA PASIEN-");
            System.out.println("=================================================");
            System.out.println("Nama Pasien \t : " + antre.getDaftarPasien().get(i).getNama());
            System.out.println("Tempat Lahir \t : " + antre.getDaftarPasien().get(i).getTempatLahir());
            System.out.print("Tanggal Lahir \t : ");
            antre.getDaftarPasien().get(i).getTanggalKelahiran();
            System.out.println("");
            System.out.println("Alamat Pasien \t : " + antre.getDaftarPasien().get(i).getAlamat());
            System.out.print("No Rekam Medis \t : " + antre.getDaftarPasien().get(i).NoRekamMedis());     
            System.out.println("");
            System.out.print("                 ");
            System.out.println("-DATA DOKTER-");
            System.out.println("=================================================");
            System.out.println("Nama Dokter \t : " + dk.getNama());
            System.out.println("Nomor Pegawai \t : " + dk.getNomorPegawai());
            System.out.println("Tempat Lahir \t : " + dk.getTempatLahir());
            System.out.print("Tanggal Lahir \t : ");
            dk.getTanggalKelahiran();
            System.out.println("");
            System.out.println("Alamat Dokter \t : " + dk.getAlamat());
            System.out.println("");
            
        }
    }
}
