/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Pasien {

    /**
     * @param args the command line arguments
     */
    private String noRekamMedis;

    
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

//    public String getNoRekamMedis() {
//        return noRekamMedis;
//    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public String NoRekamMedis(){
        // mendeklarasikan variabel nomorRekamMedis yang bertipe String
        String noRekamMedis;
        // membuat objek baru date dengan tipe data Date
        Date date = new Date();
        // membuat objek ft bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        //mendeklarasikan nilai dari variabel nomorRekamMedis yaitu tanggal ditambah 3 huruf pertama dari nama
        noRekamMedis = ft.format(date) + nama.substring(0, 3);
        //pengembalian nilai variabel nomorRekamMedis
        return noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print(ft.format(tanggalKelahiran));
    }



    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 32) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("Tanggal yang anda masukkan salah");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;

        } else {
            throw new Exception("Tahun yang anda masukkan salah");
        }
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception("Bulan yang anda masukkan salah");
        }
    }
}
