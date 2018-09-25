/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author jarkom
 */
public class DaftarAntrianDialog extends JDialog implements ActionListener {

    private JMenuBar menuBar;
    //Mendeklarasikan attribut menuBar dengan tipe data JMenuBar
    private JMenu fileMenu;
    //Mendeklarasikan attribut fileMenu dengan tipe data JMenu
    private JLabel judulLabel;
    //Mendeklarasikan attribut judulLabel dengan tipe data JLabel
    private JLabel namaLabel;
    //Mendeklarasikan attribut namaLabel dengan tipe data JLabel
    private JLabel nomerRM;
    //Mendeklarasikan attribut nomerRM dengan tipe data JLabel
    private JLabel Alamat;
    //Mendeklarasikan attribut Alamat dengan tipe data JLabel
    private JTextField namaText;
    //Mendeklarasikan attribut namaText dengan tipe data JTextField
    private JButton tambahButton;
    //Mendeklarasikan attribut saveButton dengan tipe data JButton
    private JLabel tanggalLahir;
    private JTextField alamatText;
    private JTextField nomorRMtext;
    private JTextField tanggalText;
    private JTextField bulanText;
    private JTextField tahunText;

    public DaftarAntrianDialog() {
        /**
         * Membuat Method Constructor kosong
         */
        init();
        //Memanggil method init()
    }

    public DaftarAntrianDialog(String title) {
        /**
         * Membuat method constructor dengan parameter title dengan tipe data
         * String
         */
        this.setTitle(title);
        //Mengisi nilai variable Title dengan nilai/data dari variable lokal title
        init();
        //Memanggil method title
    }

    public void init() {
        /**
         * Membuat method init dengan tipe data void, method ini berguna untuk
         * menginput nilai dari seluruh attribut
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

        nomorRMtext = new JTextField();
        //Membuat method baru namaText dengan tipe data JTextField
        nomorRMtext.setBounds(120, 50, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(nomorRMtext);
        //Menambahkan namaText
        nomorRMtext.addActionListener(this);

        namaLabel = new JLabel("Nama : ");
        //Membuat method baru Nama dengan tipe data JLabel dengan isi "Nama : "
        namaLabel.setBounds(20, 90, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(namaLabel);
        //Menambahkan Nama

        namaText = new JTextField();
        //Membuat method baru namaText dengan tipe data JTextField
        namaText.setBounds(120, 90, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(namaText);
        //Menambahkan namaText
        namaText.addActionListener(this);
        
        tanggalLahir = new JLabel();
        tanggalLahir.setText("Tanggal Lahir :");
        tanggalLahir.setBounds(20, 130, 100, 30);
        this.add(tanggalLahir);

        tanggalText = new JTextField();
        tanggalText.setBounds(120, 130, 40, 30);
        this.add(tanggalText);

        bulanText = new JTextField();
        bulanText.setBounds(170, 130, 40, 30);
        this.add(bulanText);

        tahunText = new JTextField();
        tahunText.setBounds(220, 130, 70, 30);
        this.add(tahunText);
        
        Alamat = new JLabel("Alamat : ");
        //Membuat method baru Alamat dengan tipe data JLabel dengan isi "Alamat : "
        Alamat.setBounds(20, 170, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(Alamat);
        //Menambahkan Alamat

        alamatText = new JTextField();
        //Membuat method baru namaText dengan tipe data JTextField
        alamatText.setBounds(120, 170, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(alamatText);
        //Menambahkan namaText
        alamatText.addActionListener(this);
        
        tambahButton = new JButton("TAMBAH");
        //Membuat method baru saveButton dengan tipe data JButton
        tambahButton.setBounds(120, 220, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(tambahButton);
        //Menambahkan saveButton
        tambahButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent x) {
        if (x.getSource() == nomorRMtext) {
            Pasien cari = Pasien.cariPasien(nomorRMtext.getText());
            if (cari == null) {
                JOptionPane.showMessageDialog(null, "Data Pasien " + nomorRMtext.getText() + " Pasien Tidak Ada ");
            }else{
            namaText.setText(cari.getNama());
            alamatText.setText(cari.getAlamat());
            String tanggal = String.valueOf(cari.getTanggalLahir());
                String bulan = String.valueOf(cari.getBulanLahir());
                String tahun = String.valueOf(cari.getTahunLahir());
                tanggalText.setText(tanggal);
                bulanText.setText(bulan);
                tahunText.setText(tahun);
            }
            
        }
        if (x.getSource() == tambahButton) {
            Pasien cari = Pasien.cariPasien(nomorRMtext.getText());
            for (int i = 0; i < Pasien.daftarPasien.size(); i++) {
                if (cari == Pasien.daftarPasien.get(i)) {
                    JOptionPane.showMessageDialog(null, "Anda Antrian Ke-" + (i+1));
                    this.dispose();           
                }
            }
            
        }

    }
    
}
