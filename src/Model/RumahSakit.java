/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarkom
 */
public class RumahSakit implements Serializable{

    private String nama;
    private String alamat;
    public ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    public ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    public ArrayList<AntrianKlinik> daftarAntrianKlinik = new ArrayList<AntrianKlinik>();

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }

    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    public void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> daftarAntrianKlinik) {
        this.daftarAntrianKlinik = daftarAntrianKlinik;
    }

    

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
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

    public RumahSakit() {
    }

    public void tambahPasienBaru(Pasien pasien) {
        pasien.getDaftarPasien().add(pasien);
    }

    public Pasien cariPasien(String noRM) {
        Pasien result = null;
        boolean test = false;
        for (int i = 0; i < getDaftarPasien().size() && test == false; i++) {
            if (getDaftarPasien().get(i).getNoRM().equals(noRM)) {
                return getDaftarPasien().get(i);
            }
        }
        return result;

    }

    public void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        String hasil = "";
        int dataInt;
        boolean noRM = false;
        boolean nama = false;
        boolean alamat = false;
        Pasien temp = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t') {
                        hasil = hasil + (char) dataInt;
                    } else {
                        if (noRM == false) {
                            temp.setNoRM(hasil);
                            noRM = true;
                            hasil = "";
                        } else if (nama == false) {
                            temp.setNama(hasil);
                            nama = true;
                            hasil = "";
                        }
                    }
                } else {
                    temp.setAlamat(hasil);
                    alamat = true;
                    hasil = "";
                    tambahPasienBaru(temp);
                    noRM = false;
                    nama = false;
                    alamat = false;
                    temp = new Pasien();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void simpanObjekRumahSakit(File file) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

    public void bacaObjekRumahSakit(File file) {
        try {
            FileInputStream kiwil = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(kiwil);
            RumahSakit rs = (RumahSakit) oos.readObject();
            this.setNama(rs.nama);
            this.setAlamat(rs.alamat);
            this.setDaftarAntrianKlinik(rs.daftarAntrianKlinik);
            this.setDaftarKlinik(rs.daftarKlinik);
            this.setDaftarPasien(rs.daftarPasien);
        
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
