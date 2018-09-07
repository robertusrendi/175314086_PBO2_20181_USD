/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {

    private Klinik klinik;
    private ArrayList<Pasien> DaftarPasien = new ArrayList<Pasien>();

    public AntrianPasien() {
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

}
