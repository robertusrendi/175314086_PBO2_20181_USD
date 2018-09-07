/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jarkom
 */
public class Klinik {

    private String idKlinik;
    private String namaKlinik;

    
    public Klinik() {
        /** Method constructor kosong untuk mendeklarasikan objek klinik
         * 
         */

    }

    
    public Klinik(String idKlinik, String namaKlinik) {
        // Method constructor dengan parameter lokal idKlinik dan namaKlinik yang bertipe String
        this.idKlinik = idKlinik;
        // Mendeklarasikan bahwa nilai dari variable global idKlinik sama dengan nilai dari variable lokal idKlinik
        this.namaKlinik = namaKlinik;
        // Mendeklarasikan bahwa nilai dari variable global namaKlinik sama dengan nilai dari variable lokal namaKlinik
    }

    
    public String getIdKlinik() {
        /**method ini berguna untuk memanggil/mengambil nilai dari variable idKlinik
         * 
         */
        return idKlinik;
        // mengembalikan nilai dari variable idKlinik
    }

    
    public void setIdKlinik(String idKlinik) {
        /** Method ini berguna untuk mengisi nilai dari variable lokal idKlinik yang bertipe String
         * 
         */
        this.idKlinik = idKlinik;
        // mendeklarasikan bahwa nilai dari variable global idKlinik sama dengan variable lokal idKlinik
    }

    
    public String getNamaKlinik() {
        /** Method ini berguna untuk mengambil nilai dari variable namaKlinik
         * 
         */
        return namaKlinik;
        // mengembalikan nilai dari variable namaKlinik
    }

    
    public void setNamaKlinik(String namaKlinik) {
         /** Method ini berguna untuk mengisi nilai dari variable lokal namaKlinik yang bertipe String
         * 
         */
        this.namaKlinik = namaKlinik;
        // mendeklarasikan bahwa nilai dari variable global namaKlinik sama dengan variable lokal namaKlinik
    }
}
