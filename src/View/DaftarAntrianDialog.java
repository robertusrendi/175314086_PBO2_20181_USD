/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarAntrianDialog extends javax.swing.JDialog {
    JMenuBar menuBar;
    //Mendeklarasikan attribut menuBar dengan tipe data JMenuBar
    JMenu fileMenu;
    //Mendeklarasikan attribut fileMenu dengan tipe data JMenu
    JLabel judulLabel;
    //Mendeklarasikan attribut judulLabel dengan tipe data JLabel
    JLabel namaLabel;
    //Mendeklarasikan attribut namaLabel dengan tipe data JLabel
    JLabel nomerRM;
    //Mendeklarasikan attribut nomerRM dengan tipe data JLabel
    JLabel Alamat;
    //Mendeklarasikan attribut Alamat dengan tipe data JLabel
    JLabel Nama;
    //Mendeklarasikan attribut Nama dengan tipe data JLabel
    JTextField namaText;
    //Mendeklarasikan attribut namaText dengan tipe data JTextField
    JButton saveButton;
    //Mendeklarasikan attribut saveButton dengan tipe data JButton

    public DaftarAntrianDialog() {
        /**
         * Membuat Method Constructor kosong
         */
        init();
        //Memanggil method init()
    }

    public DaftarAntrianDialog(String title) {
        /**
         * Membuat method constructor dengan parameter title dengan tipe data String
         */
        this.setTitle(title);
        //Mengisi nilai variable Title dengan nilai/data dari variable lokal title
        init();
        //Memanggil method title
    }

    public void init() {
        /**
         * Membuat method init dengan tipe data void, method ini berguna untuk menginput
         * nilai dari seluruh attribut
         */
        
        this.setLayout(null);
        //Mengisi nilai/mengeset setLayout dengan null
        judulLabel = new JLabel("Form Daftar Antrian");
        //Membuat method baru judulLabel dengan tipe data JLabel dan mengisinya dengan "Form Daftar Antrian" 
        judulLabel.setBounds(80, 15, 200, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(judulLabel);
        //Menambahkan judulLabel
        

        nomerRM = new JLabel("Nomor RM : ");
        //Membuat method baru nomorRM dengan tipe data JLabel dengan isi "Nomor RM : "
        nomerRM.setBounds(20, 50, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(nomerRM);
        //Menambahkan nomorRM
        
        Nama = new JLabel("Nama : ");
        //Membuat method baru Nama dengan tipe data JLabel dengan isi "Nama : "
        Nama.setBounds(20, 90, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(Nama);
        //Menambahkan Nama
        
        Alamat = new JLabel("Alamat : ");
        //Membuat method baru Alamat dengan tipe data JLabel dengan isi "Alamat : "
        Alamat.setBounds(20, 130, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(Alamat);
        //Menambahkan Alamat
        
        namaText = new JTextField();
        //Membuat method baru namaText dengan tipe data JTextField
        namaText.setBounds(120, 50, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(namaText);
        //Menambahkan namaText
        
        namaText = new JTextField();
        //Membuat method baru namaText dengan tipe data JTextField
        namaText.setBounds(120, 90, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(namaText);
        //Menambahkan namaText
        
        namaText = new JTextField();
        //Membuat method baru namaText dengan tipe data JTextField
        namaText.setBounds(120, 130, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(namaText);
        //Menambahkan namaText
        
        saveButton = new JButton("SIMPAN");
        //Membuat method baru saveButton dengan tipe data JButton
        saveButton.setBounds(120, 200, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(saveButton);
        //Menambahkan saveButton
        
        
    }

}
