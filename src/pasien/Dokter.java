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
public class Dokter {

    private String nomorPegawai;
    private String Nama;
    private String Alamat;
    private String tempatLahir;
    private int bulanLahir;
    private int tahunLahir;
    private int tanggalLahir;

    public String getNomorPegawai() {
        /** Method yang berfungsi untuk memanggil/memanggil nilai dari variable nomorPegawai
         * 
         */
        return nomorPegawai;
        // berguna untuk mengembalikan nilai dari variable nomorPegawai
    }

    public void setNomorPegawai(String nomorPegawai) {
        /** Method ini berguna untuk set/mengisi nilai dari variable lokal nomotPegawai
         * 
         */
        this.nomorPegawai = nomorPegawai;
        // Berfungsi untuk mendeklarasikan nilai dari variable nomorPegawai global sama dengan nilai dari variable nomorPegawai lokal
    }

    private int getTahunLahir() {
        /** Method yang berfungsi untuk memanggil/memanggil nilai dari variable tahunLahir
         * 
         */
        return tahunLahir;
        // berguna untuk mengembalikan nilai dari variable tahunLahir
    }

    private int getBulanLahir() {
        /** Method yang berfungsi untuk memanggil/memanggil nilai dari variable bulanLahir
         * 
         */
        return bulanLahir;
        // berguna untuk mengembalikan nilai dari variable bulanLahir
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 32) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("Tanggal yang anda masukkan salah");
        }
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        /** Method ini berguna untuk set/mengisi nilai dari variable lokal tahunLahir yang bertipe int
         * 
         */
        if (tahunLahir > 0) {
            // memberi syarat jika variable tahun lahir lebih dari 0 maka...
            this.tahunLahir = tahunLahir;
            // nilai dari variable global tahunLahir sama dengan nilai dari variable lokal tahunLahir

        } else {
            // Jika syarat salah maka...
            throw new Exception("Tahun yang anda masukkan salah");
            // mengembalikan/memberi pesan bahwa input tahunLahir salah
        }
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        /** Method ini berguna untuk set/mengisi nilai dari variable lokal bulanLahir yang bertipe int
         * 
         */
        if (bulanLahir > 0 && bulanLahir < 13) {
            // memberi syarat jika nilai dari variable bulanLahir lebih dari 0 dan kurang dari 13 maka...
            this.bulanLahir = bulanLahir;
            // nilai dari variable global bulanLahir akan sama dengan nilai dari variable lokal bulanLahir
        } else {
            // Jika syarat salah maka
            throw new Exception("Bulan yang anda masukkan salah");
            // akan mengembalikan/memberi pesan bahwa input bulanLahir salah
        }
    }

    public void getTanggalKelahiran() {
        /** Method ini berguna untuk mengambil/memanggil data/nilai dari variable tanggalKelahiran
         * 
         */
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        // mendelarasikan objek baru tanggalKelahiran dengan tipe Date dan dengan perhitungan Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir())
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        // mendeklarasikan objek baru ft dengan tipe data simpleDateFormat dengan format ("dd-MM-yyyy")
        System.out.print(ft.format(tanggalKelahiran));
        // menampilkan  nilai/data dari objek ft dengan format tanggalKelahiran
    }

    public String getNama() {
        /** Method yang berfungsi untuk memanggil/memanggil nilai dari variable nama
         * 
         */
        return Nama;
        // berguna untuk mengembalikan nilai dari variable nama
    }

    public void setNama(String nama) {
        /** Method ini berguna untuk set/mengisi nilai dari variable lokal nama 
         * 
         */
        this.Nama = nama;
        // Berfungsi untuk mendeklarasikan nilai dari variable nama global sama dengan nilai dari variable nama lokal
    }

    public String getAlamat() {
        /** Method yang berfungsi untuk memanggil/memanggil nilai dari variable alamat
         * 
         */
        return Alamat;
        // berguna untuk mengembalikan nilai dari variable alamat
    }

    public void setAlamat(String alamat) {
        /** Method ini berguna untuk set/mengisi nilai dari variable alamat
         * 
         */
        this.Alamat = alamat;
        // Berfungsi untuk mendeklarasikan nilai dari variable alamt global sama dengan nilai dari variable alamat lokal
    }

    public String getTempatLahir() {
        /** Method yang berfungsi untuk memanggil/memanggil nilai dari variable tempatLahir
         * 
         */
        return tempatLahir;
        // berguna untuk mengembalikan nilai dari variable tempatLahir
    }

    public void setTempatLahir(String tempatLahir) {
        /** Method ini berguna untuk set/mengisi nilai dari variable tempatLahir
         * 
         */
        this.tempatLahir = tempatLahir;
        // Berfungsi untuk mendeklarasikan nilai dari variable tempatLahir global sama dengan nilai dari variable tempatLahir lokal
    }

    public int getTanggalLahir() {
        /** Method yang berfungsi untuk memanggil/memanggil nilai dari variable tanggalLahir
         * 
         */
        return tanggalLahir;
        // berguna untuk mengembalikan nilai dari variable tanggalLahir
    }

   
}
