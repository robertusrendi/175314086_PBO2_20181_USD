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
 * @author jarkom
 */
public class AntrianKlinik {

    private ArrayList<Pasien> DaftarPasien = new ArrayList<Pasien>();
    public static ArrayList<AntrianKlinik> DaftarAntrian = new ArrayList<AntrianKlinik>();
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
    }

    public static ArrayList<AntrianKlinik> getDaftarAntrian() {
        return DaftarAntrian;
    }

    public static void setDaftarAntrian(ArrayList<AntrianKlinik> DaftarAntrian) {
        AntrianKlinik.DaftarAntrian = DaftarAntrian;
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    public AntrianKlinik() {
        /**
         * Metode constructor kosong untuk mendeklarasikan objek AntrianPasien
         *
         */
    }

    public Klinik getKlinik() {
        /**
         * Method untuk get/mengambil nilai dari variable klinik
         *
         */
        return klinik;
        // return pada method ini berguna untuk mengembalikan nilai dari variable klinik
    }

    public void setKlinik(Klinik klinik) {
        /**
         * Method ini berguna untuk set/mengisi nilai dari variable klinik
         *
         */
        this.klinik = klinik;
        // mendeklarasikan bahwa variable klinik global bernilai sama dengan variable klinik lokal dengan tipe Klinik
    }

    public ArrayList<Pasien> getDaftarPasien() {
        /**
         * Method ini berguna untuk memanggil/mengambil nilai dari variable
         * DaftarPasien
         *
         */
        return DaftarPasien;
        // return pada method ini berguna untuk mengembalikan nilai dari variable DaftarPasien
    }

    public void setDaftarPasien(ArrayList<Pasien> DaftarPasien) {
        /**
         * Method ini berguna untuk set/mengisi nilai dari variable DaftarPasien
         * yang bertipe ArrayList<Pasien>
         *
         */

        this.DaftarPasien = DaftarPasien;
        // mendeklarasikan bahwa variable DaftarPasien global bernilai sama dengan variable DaftarPasien lokal dengan tipe ArrayList<Pasien>
    }

    public void TanggalAntrian() {
        /**
         * Method ini berguna untuk menentukan waktu antrian
         *
         */

        Date date = new Date();
        // Mendeklarasikan objek baru date dengan tipe data Date
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yy");
        // membuat objek baru ft bertipe simpleDateFormat sebagai format tampilan tanggal
        System.out.println(ft.format(date));
        // Menampilkan nilai dari objek ft dengan format date
    }

    public void Mendaftar(Pasien pasien) {
        /**
         * Method ini berguna untuk mendaftarkan Pasien pada nomor antrian
         *
         */
        DaftarPasien.add(pasien);
        //Mendeklarasikan nilai dari variable Global DaftarPasien dengan nilai dari variable lokal pasien
    }
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0 ) {
            DaftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);

        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            DaftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        }
    }

 
    public static Pasien CariPasien(String noRM) {
        for (int i = 0; i < DaftarAntrian.size(); i++) {
            if (DaftarAntrian.get(i).getDaftarPasien().get(i).getNoRM().equalsIgnoreCase(noRM)) {
                return DaftarAntrian.get(i).getDaftarPasien().get(i);
            }
        }
        return null;
    }

    
    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianKlinik antre = new AntrianKlinik();
        antre.setTanggalAntrian(tanggal);
        antre.setBulanAntrian(bulan);
        antre.setTahunAntrian(tahun);
        antre.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            DaftarAntrian.add(antre);
        } else {
            System.out.println("Antrian " + klinik.getNamaKlinik()+ " Sudah Ada");
            System.out.println("");
        }
    }
    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < DaftarAntrian.size(); i++) {
            if (DaftarAntrian.get(i).getTanggalAntrian() == tanggal
                    && DaftarAntrian.get(i).getBulanAntrian() == bulan
                    && DaftarAntrian.get(i).getTahunAntrian() == tahun
                    && DaftarAntrian.get(i).getKlinik().getNamaKlinik().equalsIgnoreCase(klinik.getNamaKlinik())
                    && DaftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getIdKlinik() + klinik.getNamaKlinik();
    }

}
