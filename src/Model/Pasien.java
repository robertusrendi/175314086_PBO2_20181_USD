/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    private String nik;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public Pasien() {
        
    }

    public Pasien(String nama) {
        this.nama = nama;
    }

    public Pasien(String nama, String Alamat, String tempatLahir, int tanggal, int bulan, int tahun, String nik) {
        // pernyataan bahwa nilai variabel nama sama dengan nilai dari variabel lokal nama
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggal;
        this.bulanLahir = bulan;
        this.tahunLahir = tahun;
        this.nik = nik;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        /**
         * Method ini berguna untuk set/mengisi nilai dari varible lokal
         * noRekamMedis dengan tipe data String
         *
         */
        this.noRekamMedis = noRekamMedis;
        //Mendeklarasikan bahwa nilai dari variable global noRekamMedis sama dengan variable lokal noRekamMedis
    }

    public String getNoRekamMedis() {
        /**
         * Method untuk memanggil/mengambil nilai dari variable noRekamMedis
         *
         */
        return noRekamMedis;
        // mengembalikan nilai dari variable noRekamMedis
    }

    public String NoRekamMedis() {
        /**
         * Method ini berguna untuk mengisi data noRekamMedis
         *
         */
        String noRekamMedis;
        // mendeklarasikan variable noRekamMedis dengan tipe String
        Date date = new Date();
        // Membuat objek baru date dengan tipe data Date
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        // membuat objek baru ft dengan tipe simpleDateFormat sebagai format tampilan tanggal pendaftaran
        noRekamMedis = ft.format(date) + nama.substring(0, 3);
        //mendeklarasikan nilai dari variabel nomorRekamMedis yaitu tanggal ditambah 3 huruf pertama dari nama Pasien
        return noRekamMedis;
        // Mengembalikan nilai dari variable noRekamMedis
    }

    public String getNama() {
        /**
         * Method untuk memanggil/mengambil nilai dari varible nama
         *
         */
        return nama;
        // mengembalikan nilai dari variable nama
    }

    public void setNama(String nama) {
        /**
         * mengisi/set nilai dari variable lokal nama yang bernilai String
         *
         */
        this.nama = nama;
        // mendeklarasikan bahwa nilai dari variable global nama sama dengan nilai dari variable lokal nama
    }

    public String getAlamat() {
        /**
         * Method untuk memanggil/mengambil nilai dari varible alamat
         *
         */
        return alamat;
        // mengembalikan nilai dari variable alamat
    }

    public void setAlamat(String alamat) {
        /**
         * mengisi/set nilai dari variable lokal alamat yang bernilai String
         *
         */
        this.alamat = alamat;
        // mendeklarasikan bahwa nilai dari variable global alamat sama dengan nilai dari variable lokal alamat
    }

    public String getTempatLahir() {
        /**
         * Method untuk memanggil/mengambil nilai dari varible tempatLahir
         *
         */
        return tempatLahir;
        //mengembalikan nilai dari variable tempatLahir
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        /**
         * Method untuk memanggil/mengambil nilai dari varible tanggalLahir
         *
         */
        return tanggalLahir;
        //mengembalikan nilai dari variable tanggalLahir
    }

    public void getTanggalKelahiran() {
        /**
         * Method ini berguna untuk mengambil/memanggil data/nilai dari variable
         * tanggalKelahiran
         *
         */
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        // mendelarasikan objek baru tanggalKelahiran dengan tipe Date dan dengan perhitungan Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir())
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        // mendeklarasikan objek baru ft dengan tipe data simpleDateFormat dengan format ("dd-MM-yyyy")
        System.out.print(ft.format(tanggalKelahiran));
        // Menampilkan/print nilai dari objek ft dengan format tanggalKelahiran
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        /**
         * Method ini berguna untuk set/mengisi nilai dari variable lokal
         * tanggalLahir yang bertipe int
         *
         */
        if (tanggalLahir > 0 && tanggalLahir < 32) {
            // Memberi syarat jika nilai dari variable tanggalLahir lebih dari 0 dan kurang dari 32 maka...
            this.tanggalLahir = tanggalLahir;
            // nilai dari variable global tanggalLahir akan sama dengan nilai dari variable lokal tanggalLahir
        } else {
            // Jika syarat salah maka...
            throw new Exception("Tanggal yang anda masukkan salah");
            // akan mengembalikan/memberi pesan bahwa input tanggalLahir salah
        }
    }

    public int getBulanLahir() {
        /**
         * Method untuk memanggil/mengambil nilai dari varible bulanLahir
         *
         */
        return bulanLahir;
        // mengembalikan nilai dari variable bulanLahir
    }

    public int getTahunLahir() {
        /**
         * Method untuk memanggil/mengambil nilai dari varible tahunLahir
         *
         */
        return tahunLahir;
        //mengembalikan nilai dari variable tahunLahir
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        /**
         * Method ini berguna untuk set/mengisi nilai dari variable lokal
         * tahunLahir yang bertipe int
         *
         */
        if (tahunLahir > 0) {
            // memberi sayarat jika tahunLahir lebih dari 0 maka...
            this.tahunLahir = tahunLahir;
            // nilai dari variable global tahunLahir akan sama dengan nilai dari variable lokal tahunLahir

        } else {
            // jika syarat salah maka...
            throw new Exception("Tahun yang anda masukkan salah");
            // akan mengembalikan/memberi pesan bahwa input tahunLahir salah
        }
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        /**
         * Method ini berguna untuk set/mengisi nilai dari variable lokal
         * bulanLahir yang bertipe int
         *
         */
        if (bulanLahir > 0 && bulanLahir < 13) {
            //memberi syarat jika bulanLahir lebih dari 0 dan kurang dari 13 maka...
            this.bulanLahir = bulanLahir;
            // nilai dari variable global bulanLahir akan sama dengan nilai dari variable lokal bulanLahir
        } else {
            //Jika syarat salah maka...
            throw new Exception("Bulan yang anda masukkan salah");
            // akan mengembalikan/memberi pesan bahwa input tahunLahir salah
        }
    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        Pasien.daftarPasien = daftarPasien;
    }

    public static void tambahPasienBaru(Pasien pasien) {
        Pasien.daftarPasien.add(pasien);
    }

    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNik() == noRM) {
                return daftarPasien.get(i);
            }
        }

        return null;
    }
}
