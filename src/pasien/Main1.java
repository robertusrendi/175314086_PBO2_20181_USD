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
        Pasien ps = new Pasien();
        Dokter dk = new Dokter();
        dk.setNama("Joko Ludrug");
        dk.setAlamat("Jalan Bantul km 6, Bantul, YK");
        dk.setNomorPegawai("175314086");
        dk.setTempatLahir("Bandung");
        ps.setNama("Gisella Berta");
        ps.setTempatLahir("Sleman");
        ps.setNoRekamMedis("REN");
        ps.setAlamat("Jalan Godean km 7, Sleman, YK");
        ps.setTempatLahir("Purwokerto");
        try {
            dk.setTanggalLahir(17);
            dk.setBulanLahir(8);
            dk.setTahunLahir(1983);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            ps.setTanggalLahir(7);
            ps.setBulanLahir(7);
            ps.setTahunLahir(1999);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.print("                 ");
        System.out.println("-DATA PASIEN-");
        System.out.println("=================================================");
        System.out.println("Nama Pasien \t : " + ps.getNama());
        System.out.println("Tempat Lahir \t : " + ps.getTempatLahir());
        System.out.print("Tanggal Lahir \t : ");
        ps.getTanggalKelahiran();
        System.out.println("");
        System.out.println("Alamat Pasien \t : " + ps.getAlamat());
        System.out.print("No Rekam Medis \t : ");
        ps.getNoRekamMedisProses();
        System.out.println("");
        
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
